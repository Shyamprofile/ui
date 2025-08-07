package Webpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 

public class ExcelBook {

	public static void main(String[] args) throws IOException {
		File file= new File("D:\\Eclipse\\Downloads and extension/Test1.xlsx");
//Create Excelfile
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("ExcelBook");
		sheet.createRow(0).createCell(0).setCellValue(90);
		sheet.getRow(0).createCell(1).setCellValue(56);
		sheet.createRow(1).createCell(0).setCellValue("Atul");
		sheet.getRow(1).createCell(1).setCellValue(56);
		sheet.createRow(2).createCell(0).setCellValue("Shyam Sundar");
		sheet.getRow(2).createCell(1).setCellValue(7);
		FileOutputStream fos =new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
//Read from Excel file
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook work1= new XSSFWorkbook(fis);
		XSSFSheet sheet1= work1.getSheet("ExcelBook");
		for(int i=0; i<sheet1.getPhysicalNumberOfRows();i++) {
			for(int j=0;j<sheet1.getRow(0).getPhysicalNumberOfCells();j++) {
				System.out.print(sheet1.getRow(i).getCell(j)+"   ");
			}
			System.out.println();	
			}	
		work1.close();
		}
}
