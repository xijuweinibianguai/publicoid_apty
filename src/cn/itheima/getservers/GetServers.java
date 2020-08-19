package cn.itheima.getservers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class GetServers {
	//方法一：将传感节点OID转换成传感节点厂商FQDN(OID的完全域名格式)形式
			public static String toFqdn(String str){//将传感节点OID转换成传感节点厂商FQDN(OID的完全域名格式)形式
				String[] str1 = str.split("\\.");
				
				 int length = str1.length;//计算数组长度
			        StringBuilder sb = new StringBuilder(str.length());//新建一个StringBuilder对象
			        for (int i=length-2;i>=0;i--){
			                sb.append(str1[i]+".");//将字符串依次加入StringBuilder中
			        }
			        return sb.toString()+"oid-res.org";//输出
			}
	
	//方法二：获取naptr记录中应用属性管理服务器的url
		public static String GetApturl(String str){
		  List<String> list = new ArrayList<String>();
		  String result =null;
	       try {  
	           //Process pr  = Runtime.getRuntime().exec("dig 1.102.101818.156.16.2.oid-res.org -t naptr");//之用Rumtime执行一个cmd命令，返回一个Process对象 
	    	   Process pr  = Runtime.getRuntime().exec(str);
	           //获取执行命令进程的响应信息  
	           BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream(),Charset.forName("GBK")));  
	           while(true){  
	               //读取响应信息  
	           	String s = br.readLine();
	           	System.out.println(s);
	           	if(s==null){  
	                   break;  
	               } 
	           	list.add(s);         
	           }   
	       } catch (IOException e) {  
	           // TODO Auto-generated catch block  
	           e.printStackTrace();  
	       }
	       //取出指定oid所有的NAPTR记录
	       
	       int a = list.indexOf(";; ANSWER SECTION:");//a,b为“;; ANSWER SECTION:”以及“;; AUTHORITY SECTION:”所在行的索引
	       int b = list.indexOf(";; AUTHORITY SECTION:");
	       if(a!=12){//说明dos窗口中的naptr记录解析格式不正确
	    	   System.out.println("DNS解析格式错误");
	       }
	       else{
	       System.out.println(a);
	       System.out.println(b);
	       String[] strlist = new String[b-a-2];//naptr记录的数量
	       int i = 0;
	       if(a>b-2||a==b-2){
	    	   System.out.println("没有naptr记录");
	       }
	       while(a<b-2){//将所有的naptr记录放到strlist[]字符串数组中
	    	   strlist[i] = list.get(a+1);
	    	   a++; 
	    	   i++;
	}
		for(int t = 0;t<strlist.length;t++){
			if(strlist[t].indexOf("\"AIMS\"")!=-1){//若strlist[t]中包含"ORS+snas"
				String[] arr = strlist[t].split("\\s");//将该条naptr记录拆分（按空格拆分）
				result = arr[8].replace("!\"","").substring(7);//replace("!\"","")：截取掉结尾的!"；substring(7)从第7个字符截取到最后			
			System.out.println("result为"+result);
			}else{
				System.out.print("没有符合要求的naptr记录");
			}
		}	
	}
	       return result;
	}
		//方法三：获取naptr记录中感知信息管理服务器的url
				public static String GetSenurl(String str){
				  List<String> list = new ArrayList<String>();
				  String result =null;
			       try {  
			           //Process pr  = Runtime.getRuntime().exec("dig 1.102.101818.156.16.2.oid-res.org -t naptr");//之用Rumtime执行一个cmd命令，返回一个Process对象 
			    	   Process pr  = Runtime.getRuntime().exec(str);
			           //获取执行命令进程的响应信息  
			           BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream(),Charset.forName("GBK")));  
			           while(true){  
			               //读取响应信息  
			           	String s = br.readLine();
			           	if(s==null){  
			                   break;  
			               } 
			           	list.add(s);         
			           }   
			       } catch (IOException e) {  
			           // TODO Auto-generated catch block  
			           e.printStackTrace();  
			       }
			       //取出指定oid所有的NAPTR记录
			       
			       int a = list.indexOf(";; ANSWER SECTION:");//a,b为“;; ANSWER SECTION:”以及“;; AUTHORITY SECTION:”所在行的索引
			       int b = list.indexOf(";; AUTHORITY SECTION:");
			       if(a!=12){//说明dos窗口中的naptr记录解析格式不正确
			    	   System.out.println("DNS解析格式错误");
			       }
			       else{
			       System.out.println(a);
			       System.out.println(b);
			       String[] strlist = new String[b-a-2];//naptr记录的数量
			       int i = 0;
			       if(a>b-2||a==b-2){
			    	   System.out.println("没有naptr记录");
			       }
			       while(a<b-2){//将所有的naptr记录放到strlist[]字符串数组中
			    	   strlist[i] = list.get(a+1);
			    	   a++; 
			    	   i++;
			}
				for(int t = 0;t<strlist.length;t++){
					if(strlist[t].indexOf("\"SIMS\"")!=-1){//若strlist[t]中包含"ORS+snas"
						String[] arr = strlist[t].split("\\s");//将该条naptr记录拆分（按空格拆分）
						result = arr[8].replace("!\"","").substring(7);//replace("!\"","")：截取掉结尾的!"；substring(7)从第7个字符截取到最后			
					}
					else{
						System.out.print("没有符合要求的naptr记录");
					}
				}	
			}
			       return result;
			}
		
}
