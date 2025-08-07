package Webpractice;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.poi.xddf.usermodel.text.CapsType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ExtentSparkReportPractice2 {

	public static void main(String[] args) throws IOException {
		ExtentReports extentreport= new ExtentReports();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		Capabilities caps= ((RemoteWebDriver)driver).getCapabilities();
		caps.getBrowserName();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		ExtentSparkReporter sparkreport= new ExtentSparkReporter(new File ("D:\\Eclipse\\Downloads and extension\\ExtentSparkReport/sparkreport.html"));
//Create Spark Report failed as object of spark reporter used to filter tests on basis of condition given
		ExtentSparkReporter sparkreportfailed= new ExtentSparkReporter(new File ("D:\\Eclipse\\Downloads and extension\\ExtentSparkReport/sparkreportfailed.html"));
//Set config properties for extent report		
//		ExtentSparkReporterConfig config= sparkreport.config();
//		config.setTheme(Theme.DARK);
//		config.setTimeStampFormat("dd-MM-YYYY hh-mm");
//		config.setCss(".badge-primary{background-color:#24D5D6}");
//		config.setJs("document.getElementsByClassName(\"logo\")[0].style.display='none';");
//		sparkreport.loadJSONConfig(new File("D:\\Eclipse\\Downloads and extension\\ExtentSparkReport/spark-config.json"));
//Arrange tabs in order, can delete a few tabs too		
		sparkreport.viewConfigurer().viewOrder().as(new ViewName[] {ViewName.DASHBOARD, ViewName.TEST});
//Prints browser name , Os name	on dashboard	
		extentreport.setSystemInfo("Browsername", caps.getBrowserName());	
		extentreport.setSystemInfo("Osname", System.getProperty("os.name"));
		extentreport.attachReporter(sparkreport,sparkreportfailed);
		sparkreportfailed.filter().statusFilter().as(new Status[] {Status.FAIL , Status.WARNING});
		extentreport.createTest("SparkTest1")
		.pass("is passed")
		.fail("Is failed")
		.assignAuthor("Atul")
		.assignCategory("Sanity")
		.assignDevice("Computer")
		.info("Is info");
		extentreport.createTest("SparkTest2")
		.pass("is passed");
		extentreport.createTest("SparkTest3")
		.warning("is info");
		extentreport.flush();
		Desktop.getDesktop().browse(new File ("D:\\Eclipse\\Downloads and extension\\ExtentSparkReport/sparkreport.html").toURI());
		Desktop.getDesktop().browse(new File ("D:\\Eclipse\\Downloads and extension\\ExtentSparkReport/sparkreportfailed.html").toURI());	
	}
}
