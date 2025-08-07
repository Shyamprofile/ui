package Webpractice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.*;

public class BasicControl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Atul");
		driver.findElement(By.name("lName")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@id='hindichbx']")).click();	
	}
}
