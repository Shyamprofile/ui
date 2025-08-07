package Webpractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("-incognito");
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.wix.com/blog/best-website-designs");
		List<WebElement> linkstotest= driver.findElements(By.tagName("a"));
		for(WebElement li : linkstotest ) {
			String url = li.getAttribute("href");
			URL urltotest= new URL(url);
			URLConnection urlConnection = urltotest.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.connect();
//Prints all broken links as working links have response code as 200
			if (httpURLConnection.getResponseCode()!=200) {
				System.out.println("url is "+ url+"  "+httpURLConnection.getResponseCode());
			}
		}
	}
}
