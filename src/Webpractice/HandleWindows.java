package Webpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//Handle 2 windows(1 parent window, 1 child window)
		String ParentWindow=driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String>Windowhandles=driver.getWindowHandles();
		for(String s:Windowhandles) {
		if(!s.equals(ParentWindow)) {
			driver.switchTo().window(s);
			driver.manage().window().maximize();
			driver.findElement(By.id("firstName")).sendKeys("Atul");
		}
		}
	}
}
