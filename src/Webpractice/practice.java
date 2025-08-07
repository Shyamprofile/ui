package Webpractice;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.*;

public class practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("start-maximized");
//		option.addArguments("incognito");
		option.addExtensions(new File("D:\\Eclipse\\Downloads and extension/AdBlock.crx"));
//disables automation as title		
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		HashMap<String , Object> pref=new HashMap();
		pref.put("plugins.always_download_pdf_externally", true);
		pref.put("download.default_directory", "D:\\Eclipse\\Downloads and extension");
		option.setExperimentalOption("prefs", pref);
		
		ChromeDriver driver = new ChromeDriver(option);
		Thread.sleep(10000);
//alert		
//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(10000);
//		driver.switchTo().alert().dismiss();
//bootstrap		
//		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
//		driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
//		List<WebElement> li= new ArrayList();
//		li=driver.findElements(By.xpath("//li[contains(@role, 'presentation')]"));
//		for(WebElement a : li) {
//			if(a.getText().contentEquals("JavaScript")) {
//				a.click();
//				break;
//			}
//		}	
//broken image
//		driver.get("http://websites.milonic.com/theworldsworstwebsiteever.com");
//		List<WebElement > liu= new ArrayList();
//		liu=driver.findElements(By.tagName("img"));
//		for(WebElement a: liu) {
//			String image= a.getAttribute("src");
//			URL url= new URL(image);
//			URLConnection con= url.openConnection();
//			HttpURLConnection httpsurlconnection= (HttpURLConnection)con;
//			httpsurlconnection.connect();
//			if (httpsurlconnection.getResponseCode()==200) {
//				System.out.println(image);
//			}	
//		}
//broken link
//		driver.get("http://websites.milonic.com/theworldsworstwebsiteever.com");
//		List<WebElement > liu= new ArrayList();
//		liu=driver.findElements(By.tagName("a"));
//		for(WebElement a: liu) {
//			String image= a.getAttribute("href");
//			URL url= new URL(image);
//			URLConnection con= url.openConnection();
//			HttpURLConnection httpsurlconnection= (HttpURLConnection)con;
//			httpsurlconnection.connect();
//			if (httpsurlconnection.getResponseCode()==200) {
//				System.out.println(image);
//			}	
//		}
//takescreenshot as file
//		driver.get("https://www.google.com");
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		File src= ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("./io.png"));
//takescreenshot as string
//		driver.get("https://www.google.com");
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		String src= ts.getScreenshotAs(OutputType.BASE64);
//		byte[] imog= Base64.getDecoder().decode(src);
//		FileOutputStream fos = new FileOutputStream(new File("./imj.png"));
//		fos.write(imog);		
//takes screenshot as byte
//		driver.get("https://www.google.com");
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		byte[] src= ts.getScreenshotAs(OutputType.BYTES);
//		FileOutputStream fos = new FileOutputStream(new File("./imij.png"));
//		fos.write(src);
//Scrolls and download file
//		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
//		Thread.sleep(10000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement clickpdf= driver.findElement(By.xpath("//td[contains(text() ,'1 MB')]/following-sibling::td//a[contains(text() ,'Download sample pdf file')]"));
//		js.executeScript("arguments[0].scrollIntoView();", clickpdf);
//		driver.findElement(By.xpath("//td[contains(text() ,'1 MB')]/following-sibling::td//a[contains(text() ,'Download sample pdf file')]")).click();
//Opens file from system
//		Desktop.getDesktop().browse(new File ("D:\\Eclipse\\Downloads and extension/file-example.pdf").toURI());
//write in excel and then retreive its value
//		XSSFWorkbook workbook= new XSSFWorkbook();
//		XSSFSheet sheet=workbook.createSheet("Shhet1");
//		sheet.createRow(0).createCell(0).setCellValue("gh");
//    	sheet.getRow(0).createCell(1).setCellValue("Astuiy");
//    	sheet.createRow(1).createCell(0).setCellValue("Shyu");
//    	sheet.getRow(1).createCell(1).setCellValue("iy");
//		FileOutputStream fos = new FileOutputStream(new File("D:\\Eclipse\\Downloads and extension/Test1.xlsx"));
//		workbook.write(fos);
//		FileInputStream fis = new FileInputStream(new File("D:\\Eclipse\\Downloads and extension/Test1.xlsx"));
//		XSSFWorkbook sd= new XSSFWorkbook(fis);
//		XSSFSheet dr= sd.getSheet("Shhet1");
//		for(int i =0; i<dr.getPhysicalNumberOfRows();i++) {
//			for(int j=0; j<dr.getRow(0).getPhysicalNumberOfCells();j++) {
//				System.out.print(dr.getRow(i).getCell(j)+"  ");
//			}
//			System.out.println();
//		}
//authorize web page giving credentials
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//handling frames		
//		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//		driver.findElement(By.id("name")).sendKeys("Atul");
//		driver.switchTo().frame(driver.findElement(By.id("frm3")));
//		driver.findElement(By.id("name")).sendKeys("Shyam");
//		driver.switchTo().frame(driver.findElement(By.id("frm1")));
//		WebElement drop= driver.findElement(By.id("course"));
//		Select dropselect= new Select(drop);
//		dropselect.selectByVisibleText("Java");
//		Thread.sleep(10000);
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("name")).sendKeys("Shiva");
//		Thread.sleep(10000);
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("name")).sendKeys("Kant");
//read pdf from workspace		
//		PDDocument pf = PDDocument.load(new File("D:\\Eclipse\\Downloads and extension/file-example.pdf"));
//		PDFTextStripper pdreader= new PDFTextStripper();
//		String doc= pdreader.getText(pf);
//		System.out.print(doc);
//read pdf from url	and store it in local space	
//		driver.get("https://file-examples.com/");
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//h3[text()='Documents']")));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")))).click();
//		Thread.sleep(10000);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[text()='PDF']/following-sibling::td/a")))).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("(//a[contains (text(),'Download sample pdf file')][1])")).click();	
//		URL  url= new URL("https://file-examples.com/storage/fe0e5e78596682d89b36118/2017/10/file-sample_150kB.pdf");
//		PDDocument pd= PDDocument.load(url.openStream());
//		PDFTextStripper pdftext= new PDFTextStripper();
//		String docu=pdftext.getText(pd);
//		byte[] bytedoc= docu.getBytes();
//		System.out.print(docu);
//		FileOutputStream fos= new FileOutputStream("D:\\Eclipse\\Downloads and extension/pdftest.txt");
//		fos.write(bytedoc);
//Switch to windows		
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		String parenthandle= driver.getWindowHandle();
//		driver.switchTo().window(parenthandle);
//		driver.findElement(By.id("newTabsWindowsBtn")).click();
//		String title="Basic Controls - H Y R Tutorials" ;
//		Set<String>windowhandles= driver.getWindowHandles();
//		for(String s :windowhandles){
//			driver.switchTo().window(s);
//			String titleo= driver.getTitle();
//			if(titleo.equalsIgnoreCase(title)) {
//			driver.findElement(By.id("firstName")).sendKeys("Atul");
//			}
//		}
//		{			
//		}
	}
	}
