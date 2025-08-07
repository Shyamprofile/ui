package Webpractice;

import java.io.File;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendarpractice {

	public static void main(String[] args) throws ParseException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("start-maximized");
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.id("second_date_picker")).click();
		String date="23";
//Selecting 23/05/2024 (current month) using xpath --Todays date is 09/05/2024
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td[not(contains(@class, '-other-month '))]//a[contains(text(),'"+date+"')]")).click();
//Selecting different date ,month, year		
		String month="Jun";
		String Year="2026";
		driver.findElement(By.id("third_date_picker")).click();
		WebElement cal= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select select= new Select(cal);
		select.selectByVisibleText(month);
		WebElement calyear= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select1= new Select(calyear);
		select1.selectByVisibleText(Year);
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td[not(contains(@class, '-other-month '))]//a[contains(text(),'"+date+"')]")).click();
	}
}
