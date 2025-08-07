package Webpractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImage {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("-incognito");
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("http://websites.milonic.com/theworldsworstwebsiteever.com");
		List <WebElement> img= driver.findElements(By.tagName("img"));
		System.out.println(img.size());
//Same as broken links
		for(WebElement s:img) {
			String imgsrc= s.getAttribute("src");
			URL imgurl= new URL(imgsrc);
			URLConnection imgcon= imgurl.openConnection();
			HttpURLConnection httpurlcon= (HttpURLConnection)imgcon;
			httpurlcon.connect();
			if(httpurlcon.getResponseCode()==200) {
				System.err.println("image is " +imgsrc +" "+httpurlcon.getResponseCode());
			}
		}
	}
}
