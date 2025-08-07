package Webpractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("-incognito");
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.facebook.com");
//Gets todays date		
		LocalDate fd= LocalDate.now();		
		String kl= fd.toString();	
//Takes screenshot and copies image to destination folder as defined in file f1(row 28)
		TakesScreenshot ts= (TakesScreenshot)driver;
		File fl= new File("D:\\Eclipse\\Downloads and extension/"+kl+".png");
		File fli=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(fli, fl);
	    driver.navigate().to("https://www.google.com");
//If you take screenshot as byte , we will need FileOutput Stream to copy byte image to respective location	    
	    byte[] bytearr=ts.getScreenshotAs(OutputType.BYTES);
	    FileOutputStream fos = new FileOutputStream(new File("./screenshot4.png"));
	    fos.write(bytearr);
	    fos.close();
	    driver.navigate().to("https://www.youtube.com");
//If you take screenshot as Base 64 (string), we need to convert it to byte[] as FileOutputStream supports byte array but not string, so we use "Base64.getDecoder().decode(String to be decoded)row 40  
	    String St=ts.getScreenshotAs(OutputType.BASE64);
	    byte[] arrt=Base64.getDecoder().decode(St);
	    FileOutputStream fos2 = new FileOutputStream(new File("./screenshot7.png"));
//Copy	byte array to respective location    
	    fos2.write(arrt);
	    fos2.close();
	}
}
