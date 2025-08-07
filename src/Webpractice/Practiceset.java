package Webpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiceset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com");

	}

}
