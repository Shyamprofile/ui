
package Webpractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadPDFfromUrl {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("start-maximized");
//Disables ads using extension
		opt.addExtensions(new File ("D:\\Eclipse\\Downloads and extension/AdBlock.crx"));
		WebDriver driver = new ChromeDriver(opt);		
//Read PDF from url
		Thread.sleep(10000);
		driver.get("https://file-examples.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//h3[text()='Documents']")));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")))).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[text()='PDF']/following-sibling::td/a")))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[contains (text(),'Download sample pdf file')][1])")).click();	
		URL url = new URL("https://file-examples.com/storage/fe42d5335b663a39f9c45ee/2017/10/file-sample_150kB.pdf");
		PDDocument pdfDocumet = PDDocument.load(url.openStream());
		PDFTextStripper pds= new PDFTextStripper();
		String s= pds.getText(pdfDocumet);
		System.out.println(s);	
	}        
}
