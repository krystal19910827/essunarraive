package essunarraive;

import java.util.List;
import java.util.Scanner;

public class app {
	  public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入开始日期（ep:20171010 00）：");
	    String startDt=scanner.nextLine();
	    System.out.println("请输入结束日期（ep：20171011 00）：");
	    String endDt=scanner.nextLine();
	    scanner.close();
	    try{
	    List<String> list=query.getCustOrderId(startDt, endDt);
	    List<String> Custlist=cust4Gquery.custquery(list);
		for(int i=0;i<Custlist.size();i++){
		if (Custlist.get(i).endsWith("844")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\广东.txt");		}
		else if (Custlist.get(i).endsWith("832")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\江苏.txt");		}
		else if (Custlist.get(i).endsWith("851")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\四川.txt");		}
		else if (Custlist.get(i).endsWith("833")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\浙江.txt");		}
		else if (Custlist.get(i).endsWith("834")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\安徽.txt");		}
		else if (Custlist.get(i).endsWith("861")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\陕西.txt");		}
		else if (Custlist.get(i).endsWith("835")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\福建.txt");		}
		else if (Custlist.get(i).endsWith("831")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\上海.txt");		}
		else if (Custlist.get(i).endsWith("813")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\河北.txt");		}
		else if (Custlist.get(i).endsWith("815")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\内蒙古.txt");		}
		else if (Custlist.get(i).endsWith("843")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\湖南.txt");		}
		else if (Custlist.get(i).endsWith("821")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\辽宁.txt");		}
		else if (Custlist.get(i).endsWith("842")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\湖北.txt");		}
		else if (Custlist.get(i).endsWith("852")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\贵州.txt");		}
		else if (Custlist.get(i).endsWith("837")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\山东.txt");		}
		else if (Custlist.get(i).endsWith("850")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\重庆.txt");		}
		else if (Custlist.get(i).endsWith("865")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\新疆.txt");		}
		else if (Custlist.get(i).endsWith("811")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\北京.txt");		}
		else if (Custlist.get(i).endsWith("812")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\天津.txt");		}
		else if (Custlist.get(i).endsWith("836")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\江西.txt");		}
		else if (Custlist.get(i).endsWith("863")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\青海.txt");		}
		else if (Custlist.get(i).endsWith("862")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\甘肃.txt");		}
		else if (Custlist.get(i).endsWith("822")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\吉林.txt");		}
		else if (Custlist.get(i).endsWith("841")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\河南.txt");		}
		else if (Custlist.get(i).endsWith("823")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\黑龙江.txt");		}
		else if (Custlist.get(i).endsWith("853")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\云南.txt");		}
		else if (Custlist.get(i).endsWith("845")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\广西.txt");		}
		else if (Custlist.get(i).endsWith("814")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\山西.txt");		}
		else if (Custlist.get(i).endsWith("846")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\海南.txt");		}
		else if (Custlist.get(i).endsWith("864")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\宁夏.txt");		}
		else if (Custlist.get(i).endsWith("854")){savetxt.saveAsFileWriter(Custlist.get(i).substring(0, 64), "详单缓存\\西藏.txt");		}
		
		}
}    catch (Exception e) {System.out.println("查询无记录");
	    e.printStackTrace();        }
	}
}

