package Webpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrappractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("-incognito");
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
// Bootstrap dropdown is one which does not have select attribute so we have to treat it as normal webelement not dropdown element
		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
		driver.findElement(By.id("btnDropdownDemo")).click();
		List<WebElement> option= driver.findElements(By.xpath("//a[@class='dropdown-item']"));
		for(WebElement s:option) {
			System.out.println(s.getText());
		}
		driver.findElement(By.linkText("jQuery")).click();
	}
}
