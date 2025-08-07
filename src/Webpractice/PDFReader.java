package Webpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PDFReader {

	public static void main(String[] args) throws IOException {
		File file= new File("D:\\Eclipse\\Downloads and extension/file-example.pdf");
//Read pdf file from  a location
		FileInputStream fis= new FileInputStream(file);
		PDDocument pdfDocumet = PDDocument.load(fis);
		PDFTextStripper pds= new PDFTextStripper();
		String doc= pds.getText(pdfDocumet);
		System.out.println(doc);
//Get text of pdf file and store it in text file
		byte[] butearray= doc.getBytes();
		File file1= new File("D:\\Eclipse\\Downloads and extension/SampleTest.txt");
		FileOutputStream fos = new FileOutputStream(file1);
		fos.write(butearray);
	}
}
