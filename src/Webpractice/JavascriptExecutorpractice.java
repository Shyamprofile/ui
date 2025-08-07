package Webpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorpractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://maven.com/");
		WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Articles')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
//To scroll to specific element		
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
//To scroll using x,y coordinates
		js.executeScript("window.scrollTo(200,700)");
		js.executeScript("alert('Hello')");
	}
}
