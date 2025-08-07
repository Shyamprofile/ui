package Webpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Shyam");
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Atul");
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("Sundar");
		driver.switchTo().frame("frm1");
		Select select= new Select(driver.findElement(By.id("selectnav1")));
		select.selectByVisibleText("Tech News");
//Will switch to preceeding frame		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("lastName")).sendKeys("Singh");
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Sundar");
	}
}
