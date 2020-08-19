package cn.itheima.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import cn.itheima.service.CalldosService;

public class CalldosServiceImpl implements CalldosService{
	ArrayList<String> arrayList = new ArrayList<String>();
		
	//调用dos窗口获取naptr记录中的url地址
		public void GetUrl(String str){
			 int a=0;
	        try {  
	            Process pr  = Runtime.getRuntime().exec(str);//之用Rumtime执行一个cmd命令，返回一个Process对象  
	            //获取执行命令进程的响应信息  
	            BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream(),Charset.forName("GBK")));  
	            while(true){  
	                //读取响应信息  
	                //String s = new String(br.readLine().getBytes("GBK"),"UTF-8");  
	                //arrayList.add(s);
	            	String s = br.readLine();
	                if(s=="往返行程的估计时间(以毫秒为单位):\r\n"){
	            		a++;
	            	}
	            	if(s==null){  
	                    break;  
	                } 
	                System.out.println(s);
	            }  
	            
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        } 
	       
	        /*for(String str1:arrayList){
            	//if(str1==";; ANSWER SECTION:"){
	        	System.out.println(str1);
            	if(str1=="往返行程的估计时间(以毫秒为单位):\r\n"){
            		a++;
            	}
            }*/
	        System.out.println(a);
	    }
		//将OID转换成FQDN(OID的完全域名格式)形式
		public String toFqdn(String str){
			String[] str1 = str.split("\\.");
			 int length = str1.length;//计算数组长度
		        StringBuilder sb = new StringBuilder(str.length());//新建一个StringBuilder对象
		        for (int i=length-1;i>=0;i--){
		                sb.append(str1[i]+".");//将字符串依次加入StringBuilder中
		        }
		        return sb.toString()+"oid-res.org";//输出
		}
	}

