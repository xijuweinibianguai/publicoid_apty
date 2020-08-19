package cn.itheima.domain;
//客户端文本文件，服务器端文本文件
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class CilentDemo {
public static void main(String[] args)throws IOException {
	//创建客户端Socket对象
	Socket s = new Socket("127.0.0.1",7777);
	//封装文本文件
	BufferedReader br = new BufferedReader(new FileReader("test1.json"));
	//封装通道内数据流
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	String line = null;
	while((line=br.readLine())!=null){
		bw.write(line);
		bw.newLine();
		bw.flush();
	}
	//自定义一个结束标记
//	bw.write("over");
//	bw.newLine();
//	bw.flush();
	//socket提供了终止功能，他会告诉服务器别等了，我已经没有数据过来了
	s.shutdownOutput(); 
	
	//接收反馈
		BufferedReader brCilent = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String client = brCilent.readLine();
		System.out.println(client);
		//释放资源
	br.close();
	s.close();
}
}
