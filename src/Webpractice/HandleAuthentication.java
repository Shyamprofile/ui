package Webpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthentication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
//For entering credentials while logging into site we give url as
//"https://admin:admin@url"
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
