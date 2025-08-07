package Webpractice;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("-incognito");
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("Atul");
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("Sundar");
		driver.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.id("display-other-button")).click();
//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hidden"))));
	}
}
