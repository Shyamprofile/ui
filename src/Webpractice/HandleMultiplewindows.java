package Webpractice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultiplewindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String title="Contact Me - H Y R Tutorials";
		String ParentWindow=driver.getWindowHandle();		
//Handle multiple windows and tabs	
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Set<String>MultipleWindowhandles=driver.getWindowHandles();
		for(String s:MultipleWindowhandles) {
			driver.switchTo().window(s);
//Switch to child window,maximize it and fill detail			
			if(driver.getTitle().equals(title)) {
			driver.manage().window().maximize()	;
		    driver.findElement(By.id("ContactForm1_contact-form-name")).sendKeys("Shyam");
			}
//Switch to child tab and click on alert and accept it				
			if(driver.getTitle().equals("AlertsDemo - H Y R Tutorials")) {
			driver.switchTo().window(s);
			driver.findElement(By.id("alertBox")).click();
			driver.switchTo().alert().accept();
			Thread.sleep(10000);
			}
			System.out.println(driver.getTitle());
	}
	}
}
