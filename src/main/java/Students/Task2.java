package Students;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task2 {
		public static void main(String[] args) {
			
		String file="D:\\Log\\Students_Details2.xlsx";
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("Students_Details");
		
		XSSFRow rowhead=sheet.createRow(0);
		rowhead.createCell(0).setCellValue("S.NO");
		rowhead.createCell(1).setCellValue("STUDENT NAME");
		rowhead.createCell(2).setCellValue("ROLL NUMBER");
		rowhead.createCell(3).setCellValue("SECTION");
		rowhead.createCell(4).setCellValue("GENDER");
		
		Students s1=new Students();
		s1.setName("Karthik");
		s1.setRollNumber(1101);
		s1.setGender("Male");
		s1.setSection("A");
		
		Students s2=new Students();
		s2.setName("Sathya");
		s2.setRollNumber(1102);
		s2.setGender("Female");
		s2.setSection("B");
		
		Students s3=new Students();
		s3.setName("Thrisha");
		s3.setRollNumber(1103);
		s3.setGender("Female");
		s3.setSection("A");
		
		Students[] sts= {s1,s2,s3};
		
		for(int i=0;i<sts.length;i++) {
			XSSFRow row=sheet.createRow(i+1);
			row.createCell(0).setCellValue(i+1);
			row.createCell(1).setCellValue(sts[i].getName());
			row.createCell(2).setCellValue(sts[i].getRollNumber());
			row.createCell(3).setCellValue(sts[i].getSection());
			row.createCell(4).setCellValue(sts[i].getGender());
		}
		
		try {
			
		FileOutputStream out=new FileOutputStream(file);
		book.write(out);
		out.close();
		book.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Excel sheet created");
		
		}

	}

