package Webpractice;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableChromeControlledByAutomation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("start-maximized");
//Removes Chrome is being controlled by Automation. As exclude switches is plural so we give values as Array
	  //opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
//Removes Chrome is being controlled by Automation. As exclude switches is plural so we give values as List		
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	}
}
