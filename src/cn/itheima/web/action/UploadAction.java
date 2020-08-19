package cn.itheima.web.action;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.text.DecimalFormat;  
import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.NodeInfo;
import cn.itheima.service.UploadService;
import cn.itheima.service.impl.UploadServiceImpl;


  
public class UploadAction extends ActionSupport{  
private File excel;
private String excelFileName;
private String excelContentType;// 要上传的文件的类型
private NodeInfo nf;
private UploadService us = new UploadServiceImpl();

public File getExcel() {
	return excel;
}

public void setExcel(File excel) {
	this.excel = excel;
}

public String getExcelFileName() {
	return excelFileName;
}

public void setExcelFileName(String excelFileName) {
	this.excelFileName = excelFileName;
}

public String getExcelContentType() {
	return excelContentType;
}

public void setExcelContentType(String excelContentType) {
	this.excelContentType = excelContentType;
}

public NodeInfo getNf() {
	return nf;
}

public void setNf(NodeInfo nf) {
	this.nf = nf;
}

public UploadService getUs() {
	return us;
}

public void setUs(UploadService us) {
	this.us = us;
}

public String execute() throws IOException {
    int filesize = this.getExcelFileName().length(); 
    String fileEx = this.getExcelFileName().substring( 
            this.getExcelFileName().indexOf("."), filesize); 
    //获取文件名 
    String fileName=excelFileName.substring(0,excelFileName.indexOf(".")); 
    // 获得上传路径 
    String realPath = ServletActionContext.getServletContext().getRealPath( 
            "/upload/"); 
    File saveFile=null; 
    if (excel != null) { 
        // 修改文件名，使上传后不至于重复替代 
        // this.uploadFileName = new Date().getTime() + fileEx; 
        saveFile = new File(new File(realPath), excelFileName); 
        if (!saveFile.getParentFile().exists()) { 
            saveFile.getParentFile().mkdirs(); 
        } 

        FileUtils.copyFile(excel, saveFile);
        if (fileEx.equals(".xls") || fileEx.equals(".xlsx")) { 
		HSSFWorkbook book = new HSSFWorkbook(new FileInputStream(saveFile));
		HSSFSheet sheet = book.getSheetAt(0);
		
//		for (int i = 0; i <= sheet.getLastRowNum(); i++) {			// 得到行			
//			HSSFRow row = sheet.getRow(i);	
//			for (int j = 0; j < row.getLastCellNum(); j++) {				// 得到一行中的单元格		
//				HSSFCell cell = row.getCell(j);
//				System.out.println(cell + "\t");			
//				}				
//			}
//		
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			NodeInfo f = new NodeInfo(); 
			HSSFRow row = sheet.getRow(i);
			HSSFCell cell = row.getCell(0);
			//cell.getNumericCellValue()结果带小数点，但是nodeinfo表外键manuf_id中已存在的生产厂商代码全为整数，所以需转化为整数
			int s= (int)cell.getNumericCellValue();
			f.setManuf_id(s);
			f.setNode_oid(row.getCell(1).getStringCellValue());
			System.out.println(row.getCell(1).getStringCellValue());
//				f.setUsr_id("1");//在nodeinfo表里面允许为空
			us.save(f);
			System.out.println("添加成功");
			}
        }
        return "sus";

	
        }else{
        	return "err";
        	}
        }
public String nodeinfoUpdate() throws IOException {
	   int filesize = this.getExcelFileName().length(); 
	    String fileEx = this.getExcelFileName().substring( 
	            this.getExcelFileName().indexOf("."), filesize); 
	    //获取文件名 
	    String fileName=excelFileName.substring(0,excelFileName.indexOf(".")); 
	    // 获得上传路径 
	    String realPath = ServletActionContext.getServletContext().getRealPath( 
	            "/excelUpdate/"); 
	    File saveFile=null; 
	    if (excel != null) { 
	        // 修改文件名，使上传后不至于重复替代 
	        // this.uploadFileName = new Date().getTime() + fileEx; 
	        saveFile = new File(new File(realPath), excelFileName); 
	        if (!saveFile.getParentFile().exists()) { 
	            saveFile.getParentFile().mkdirs(); 
	        } 

	        FileUtils.copyFile(excel, saveFile);
	        if (fileEx.equals(".xls") || fileEx.equals(".xlsx")) { 
			HSSFWorkbook book = new HSSFWorkbook(new FileInputStream(saveFile));
			HSSFSheet sheet = book.getSheetAt(0);
			
//			for (int i = 0; i <= sheet.getLastRowNum(); i++) {			// 得到行			
//				HSSFRow row = sheet.getRow(i);	
//				for (int j = 0; j < row.getLastCellNum(); j++) {				// 得到一行中的单元格		
//					HSSFCell cell = row.getCell(j);
//					System.out.println(cell + "\t");			
//					}				
//				}
//			
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				HSSFRow row = sheet.getRow(i);
				HSSFCell cell = row.getCell(0);
				//cell.getNumericCellValue()结果带小数点，但是nodeinfo表外键manuf_id中已存在的生产厂商代码全为整数，所以需转化为整数
				int  userid= (int)cell.getNumericCellValue();;
				String nodeoid=row.getCell(1).getStringCellValue();
				us.update( userid,nodeoid);
				System.out.println("添加成功");
				}
	        }
	        return "sus";

		
	        }else{
	        	return "err";
	        	}
	
}
}