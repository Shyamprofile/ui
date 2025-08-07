package Webpractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//Selects an option from dropdown
		Select select= new Select(driver.findElement(By.id("course")));
		select.selectByVisibleText("Java");
//Selects multiple options from dropdown
		Select selectmultiple= new Select(driver.findElement(By.id("ide")));
		selectmultiple.selectByIndex(1);
		selectmultiple.selectByVisibleText("Eclipse");
		selectmultiple.selectByValue("nb");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//deselects an option from dropdown		
		selectmultiple.deselectByValue("nb");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//Prints all option from dropdown		
		List<WebElement> Dropdownlist= selectmultiple.getOptions();
		for(Object o:Dropdownlist ) {
			System.out.println(((WebElement) o).getText());
		}
		System.out.println("------------");
//Prints all selected option from dropdown
		List<WebElement> Dropdownlistselected= selectmultiple.getAllSelectedOptions();
		for(Object o:Dropdownlistselected ) {
			System.out.println(((WebElement) o).getText());
		}
		System.out.println("------------");
//Prints first option (as per list in dropdown)from dropdown
		System.out.println(selectmultiple.getFirstSelectedOption().getText());
//Deselects all options from dropdown		
		selectmultiple.deselectAll();
	}
}
