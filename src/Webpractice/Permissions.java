package Webpractice;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Permissions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("--incognito");
		opt.addArguments("start-maximized");
//We cant disable geolocation and media stream using Chromeoptions directly so will have to use Hash map to do it and then merge the 
//Changes using Set experimental option
//Site for Chromeoptions list "https://sites.google.com/chromium.org/driver/capabilities"
		HashMap<String, Integer> contentsetting= new HashMap();
		HashMap<String, Object> profile= new HashMap();
		HashMap<String, Object> pref= new HashMap();
		contentsetting.put("geolocation", 1);
		contentsetting.put("media_stream", 1);
		profile.put("managed_default_content_settings", contentsetting);
		pref.put("profile", profile);
		opt.setExperimentalOption("prefs", pref);
//Disables notification
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://web-push-book.gauntface.com/demos/notification-examples/");
		driver.findElement(By.xpath("//input[@class='c-toggle js-example-toggle']")).click();
		driver.get("https://whatmylocation.com/");
		driver.navigate().to("https://webcamtests.com/");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("webcam-launcher"))));
		driver.findElement(By.id("webcam-launcher")).click();
	}
}
