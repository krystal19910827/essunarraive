package essunarraive;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class cust4Gquery {
	public static List<String> custquery(List<String> list){
	List<String> Custlist=new ArrayList <String>();
	Connection jdbc_Connect_Oracle = null;
    PreparedStatement pstmtX = null;
    try{
    for(int i=0;i<list.size();i++){
    String CustOrderId=list.get(i).split("\\|")[0];
    String province=list.get(i).split("\\|")[1];
    String dbNbr=null;
    if (province.equals("844")){
    	jdbc_Connect_Oracle=db4Gconnection.getCrm0102GdJsDbConnection();
        dbNbr="1";
    } else if(province.equals("832")){
    	jdbc_Connect_Oracle=db4Gconnection.getCrm0102GdJsDbConnection();
    	dbNbr="2";
    }
    else if (province.equals("851")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm0304ScZjDbConnection();
		dbNbr="3";
    }
    else if (province.equals("833")) {
    	jdbc_Connect_Oracle = db4Gconnection.getCrm0304ScZjDbConnection();
    	dbNbr="4";
    }
    else if (province.equals("834")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm0506AhSxDbConnection();
		dbNbr="5";
    }  else if(province.equals("861")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm0506AhSxDbConnection();
		dbNbr="6";
    } else if (province.equals("835")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm0708FjShDbConnection();
		dbNbr="7";
    }else if  (province.equals("831")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm0708FjShDbConnection();
		dbNbr="8";
    } else if (province.equals("813")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm09HbDbConnection();
		dbNbr="9";
    } else if (province.equals("815")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm10NmDbConnection();
		dbNbr="10";
    } else if (province.equals("843")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm1112HnLnDbConnection();
    	dbNbr="11";
    }else if  (province.equals("821")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm1112HnLnDbConnection();
		dbNbr="12";
    } else if (province.equals("842")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm1314HbGzDbConnection();
		dbNbr="13";
    }else if  (province.equals("852")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm1314HbGzDbConnection();
		dbNbr="14";
    } else if (province.equals("837")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm1516SdCqDbConnection();
		dbNbr="15";
    }else if  (province.equals("850")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm1516SdCqDbConnection();
		dbNbr="16";
    } else if (province.equals("865")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm1718XjBjDbConnection();
		dbNbr="17";
    }else if(province.equals("811")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm1718XjBjDbConnection();
		dbNbr="18";
    } else if (province.equals("812")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm1920TjJxDbConnection();
		dbNbr="19";
    } else if  (province.equals("836")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm1920TjJxDbConnection();
		dbNbr="20";
	} else if (province.equals("863")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm2122QhGsDbConnection();
		dbNbr="21";
	}else if (province.equals("862")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm2122QhGsDbConnection();
		dbNbr="22";
	} else if (province.equals("822")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm2324JlHnDbConnection();
		dbNbr="23";
	}else if  (province.equals("841")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm2324JlHnDbConnection();
		dbNbr="24";
	} else if (province.equals("823")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm2526HlYnDbConnection();
		dbNbr="25";
	}else if(province.equals("853")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm2526HlYnDbConnection();
		dbNbr="26";
	} else if (province.equals("845")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm2728GxSxDbConnection();
		dbNbr="27";
	}else if (province.equals("814")) {
		jdbc_Connect_Oracle = db4Gconnection.getCrm2728GxSxDbConnection();
		dbNbr="28";
	} else if (province.equals("846")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm293031HnNxXzDbConnection();	
        dbNbr="29";
	}else if (province.equals("864")){
		jdbc_Connect_Oracle = db4Gconnection.getCrm293031HnNxXzDbConnection();	
	     dbNbr="30";
	}else if (province.equals("854"))  {
		jdbc_Connect_Oracle = db4Gconnection.getCrm293031HnNxXzDbConnection();	
		dbNbr="31";}
    String sql00="select Cust_order_id,status_cd from crm_app_"+dbNbr+".customer_order  where cust_order_id =? ";
    String sql="select C.Cust_order_id,C.cust_so_number,C.status_cd,A.transaction_id,substr(C.common_region_id,0,3) from crm_app_"+dbNbr+".customer_order C,crm_app_"+dbNbr+".listener_record A where cust_order_id =?  and A.msg_type_cd in ('102') and C.status_cd='201300' and C.Cust_order_id=A.obj_id";    
    PreparedStatement pstmtX00 = jdbc_Connect_Oracle.prepareStatement(sql00);
	pstmtX00.setString(1, CustOrderId);
	ResultSet result00 = pstmtX00.executeQuery();
	String sql0="select msg_id from intf_"+dbNbr+".listener_record t where t.obj_id =? and t.msg_type_cd=? ";
	PreparedStatement pstmtX0 = jdbc_Connect_Oracle.prepareStatement(sql0);
	while(result00.next()){
	String status_cd=result00.getString(2);
	System.out.println(status_cd);
	if(status_cd.indexOf("201300")!=-1){
	    pstmtX = jdbc_Connect_Oracle.prepareStatement(sql);
	    pstmtX.setString(1, CustOrderId);
	    ResultSet result = pstmtX.executeQuery();
    if (result.next())    {
    	System.out.println("下省中"+result00.getString(1));
    	String transid=null;
    	if(result.getString(4)==null){
    		transid="                                       ";
    	}
    	else {transid=result.getString(4);}
    Custlist.add(result.getString(1).concat("  ").concat(result.getString(2)).concat("  ").concat(transid).concat(result.getString(5)));	
    	}}
	else if(status_cd.indexOf("201900")!=-1){ 
    pstmtX0.setString(1, CustOrderId);
    pstmtX0.setString(2, "102");
   ResultSet result0 = pstmtX0.executeQuery();
   while (result0.next())    {
   	System.out.println("下省失败"+result00.getString(1));
    String msgid=result0.getString(1);
    String sql1="insert into intf_"+dbNbr+".intf_co_dispatch_msg t select * from  crm_app_"+dbNbr+".intf_co_dispatch_msg_his a where a.msg_id =? ";
    String sql2="delete from intf_"+dbNbr+".intf_co_dispatch_msg_his t where t.msg_id=? ";
    String sql3="update intf_"+dbNbr+".intf_co_dispatch_msg t set t.deal_flag='Q' where t.msg_id = ? ";
    PreparedStatement pstmtX1 = jdbc_Connect_Oracle.prepareStatement(sql1);
    PreparedStatement pstmtX2 = jdbc_Connect_Oracle.prepareStatement(sql2);
    PreparedStatement pstmtX3 = jdbc_Connect_Oracle.prepareStatement(sql3);
    pstmtX1.setString(1, msgid);
    pstmtX2.setString(1, msgid);
    pstmtX3.setString(1, msgid);
    pstmtX1.executeQuery();
    pstmtX2.executeQuery();
    pstmtX3.executeQuery();
    System.out.println("已重新下省！");
   }
    }
	else if(status_cd.indexOf("301200")!=-1){
	System.out.println("已归档重新报竣ESS"+result00.getString(1));
    pstmtX0.setString(1, CustOrderId);
    pstmtX0.setString(2, "111");
    ResultSet result0 = pstmtX0.executeQuery();
    while (result0.next())    {
    	String msgid=result0.getString(1);
    	String sql1="insert into intf_"+dbNbr+".intf_co_osr_msg t select * from  crm_app_"+dbNbr+".intf_co_osr_msg_his a where a.msg_id =? ";
        String sql2="delete from intf_"+dbNbr+".intf_co_osr_msg_his t where t.msg_id=? ";
        String sql3="update intf_"+dbNbr+".intf_co_osr_msg t set t.deal_flag='Q' where t.msg_id = ? ";
        PreparedStatement pstmtX1 = jdbc_Connect_Oracle.prepareStatement(sql1);
        PreparedStatement pstmtX2 = jdbc_Connect_Oracle.prepareStatement(sql2);
        PreparedStatement pstmtX3 = jdbc_Connect_Oracle.prepareStatement(sql3);
        pstmtX1.setString(1, msgid);
        pstmtX2.setString(1, msgid);
        pstmtX3.setString(1, msgid);
        pstmtX1.executeQuery();
        pstmtX2.executeQuery();
        pstmtX3.executeQuery();
        System.out.println("已重新报竣ESS！"); 
    }
	}
	System.out.println(result00.getString(1));
    }
    }
    jdbc_Connect_Oracle.close();} catch (SQLException e1)
    {e1.printStackTrace();   }   
    return Custlist;
}
}

