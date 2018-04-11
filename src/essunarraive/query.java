package essunarraive;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class query {
	 public static  List<String> getCustOrderId(String startDt,String endDt){
		Connection conn =dbconnect.getconnect();
		List<String> list = new ArrayList <String>();
	    String sql = "SELECT /*+parallel(16)*/ eo.cust_order_id,substr(eo.common_region_id,0,3) FROM ess_app_pub.ecs_order eo "
	    		    +" where eo.create_dt >= to_date ('"+startDt+":00:00','yyyymmdd hh24:mi:ss') and eo.create_dt < to_date ('"+endDt+":00:00','yyyymmdd hh24:mi:ss')"
	    		    +"and eo.status_cd = '12' order by cust_order_id";
	    try
	    {
	PreparedStatement pre = conn.prepareStatement(sql);// 实例化预编译语句
	ResultSet result = pre.executeQuery();
	while (result.next()){
		list.add(result.getString(1)+"|"+result.getString(2));
	}
	conn.close();
	    }catch (SQLException e1)
	    {e1.printStackTrace();  }
	    return list;
	}
}
