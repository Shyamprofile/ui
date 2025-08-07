package Webpractice;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Download {

	public static void main(String[] args) throws IOException, InterruptedException  {
		ChromeOptions opt= new ChromeOptions(); 
//		opt.addArguments("-incognito");
		opt.addArguments("start-maximized");
		opt.setAcceptInsecureCerts(true);
		opt.addExtensions(new File("D:\\Eclipse\\Downloads and extension/AdBlock.crx"));
		Map<String, Object> pref= new HashMap();
//Download file which opens in chrome instead of getting downloaded easily
		pref.put("plugins.always_open_pdf_externally", true);
//Changes folder of download directory from download to path specified		
		pref.put("download.default_directory", "D:\\Eclipse\\Downloads and extension");
		opt.setExperimentalOption("prefs", pref);
		Thread.sleep(10000);
		WebDriver driver= new ChromeDriver(opt);
		Thread.sleep(10000);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("(//a[contains(text(), 'Download sample pdf file')])[2]")));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[contains(text(), 'Download sample pdf file')])[2]")).click();	
		Desktop.getDesktop().browse(new File ("D:\\Eclipse\\Downloads and extension/file-example.pdf").toURI());
	}
}
