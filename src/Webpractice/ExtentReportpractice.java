package Webpractice;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExtentReportpractice {
 static WebDriver driver;
	public static void main(String[] args) throws IOException {
//Create object from extent report
		ExtentReports extrepo= new ExtentReports();
//Create object for Sparkreporter
		ExtentSparkReporter spark = new ExtentSparkReporter(new File ("D:\\Eclipse\\Downloads and extension\\ExtentSparkReport/report.html"));
		extrepo.attachReporter(spark);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
//Use screenshot method for file
		String fs= CaptureScreenshot();
//Use screenshot method for Base 64
		String ts= CaptureScreenshot1();
//XML string
		String xml = "<!DOCTYPE glossary PUBLIC \"-//OASIS//DTD DocBook V3.1//EN\">\r\n"
				+ " <glossary><title>example glossary</title>\r\n"
				+ "  <GlossDiv><title>S</title>\r\n"
				+ "   <GlossList>\r\n"
				+ "    <GlossEntry ID=\"SGML\" SortAs=\"SGML\">\r\n"
				+ "     <GlossTerm>Standard Generalized Markup Language</GlossTerm>\r\n"
				+ "     <Acronym>SGML</Acronym>\r\n"
				+ "     <Abbrev>ISO 8879:1986</Abbrev>\r\n"
				+ "     <GlossDef>\r\n"
				+ "      <para>A meta-markup language, used to create markup\r\n"
				+ "languages such as DocBook.</para>\r\n"
				+ "      <GlossSeeAlso OtherTerm=\"GML\">\r\n"
				+ "      <GlossSeeAlso OtherTerm=\"XML\">\r\n"
				+ "     </GlossDef>\r\n"
				+ "     <GlossSee OtherTerm=\"markup\">\r\n"
				+ "    </GlossEntry>\r\n"
				+ "   </GlossList>\r\n"
				+ "  </GlossDiv>\r\n"
				+ " </glossary>";
//Json string
		String json = "{\r\n"
				+ "    \"glossary\": {\r\n"
				+ "        \"title\": \"example glossary\",\r\n"
				+ "		\"GlossDiv\": {\r\n"
				+ "            \"title\": \"S\",\r\n"
				+ "			\"GlossList\": {\r\n"
				+ "                \"GlossEntry\": {\r\n"
				+ "                    \"ID\": \"SGML\",\r\n"
				+ "					\"SortAs\": \"SGML\",\r\n"
				+ "					\"GlossTerm\": \"Standard Generalized Markup Language\",\r\n"
				+ "					\"Acronym\": \"SGML\",\r\n"
				+ "					\"Abbrev\": \"ISO 8879:1986\",\r\n"
				+ "					\"GlossDef\": {\r\n"
				+ "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\r\n"
				+ "						\"GlossSeeAlso\": [\"GML\", \"XML\"]\r\n"
				+ "                    },\r\n"
				+ "					\"GlossSee\": \"markup\"\r\n"
				+ "                }\r\n"
				+ "            }\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}";
		List list= new ArrayList();
		list.add("Atul");
		list.add(4);
		list.add(4.5);		
		HashMap map= new HashMap();
		map.put(7, "Atu");
		map.put("Shhy", "gudr");
		extrepo.createTest("Test1")
//Adds screenshot from path at title level
		.addScreenCaptureFromPath(fs, "Screeninfo")
		.log(Status.FAIL, "Its failed")
//Adds screenshot from path at log level
		.pass(MediaEntityBuilder.createScreenCaptureFromPath(fs, "Screencapture").build())
//Prints info 1 in blue in bold and italic		
		.info("<b><i>info1</i></b>")
//Prints Is warning in green background
		.warning(MarkupHelper.createLabel("Is warning", ExtentColor.GREEN))
//Prints json data under details in proper format
		.fail(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON))
//Prints xml data under details in proper format
		.fail(MarkupHelper.createCodeBlock(json, CodeLanguage.XML))
// Creates ordered list for list and map
		.pass(MarkupHelper.createOrderedList(list))
		.pass(MarkupHelper.createOrderedList(map))
//Assign author, category and device
		.assignAuthor("Atul").assignCategory("Sanity").assignDevice("Web");
		extrepo.createTest("Test2")
//Adds screenshot from base64 at title level
		.addScreenCaptureFromBase64String(ts)
//Adds screenshot from base64 at log level
		.pass(MediaEntityBuilder.createScreenCaptureFromBase64String(ts).build())
		.assignAuthor("Atul").assignCategory("Sanity").assignDevice("Web");
//Flushes report				
		extrepo.flush();
//Opens report from windows Explorer		
		Desktop.getDesktop().browse(new File ("D:\\Eclipse\\Downloads and extension\\ExtentSparkReport/report.html").toURI());
	}
//Method to capture screenshot and saving it in file path and returning file path as string
	public static String CaptureScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile= ts.getScreenshotAs(OutputType.FILE);
		File destfile= new File("D:\\Eclipse\\Downloads and extension\\ExtentSparkReport/extreport.png");
		FileUtils.copyFile(srcfile, destfile);
		Desktop.getDesktop().browse(new File("D:\\Eclipse\\Downloads and extension\\ExtentSparkReport/extreport.png").toURI());
		return destfile.getAbsolutePath();
	}
//Method to capture screenshot as Base 64 string and returning it
	public static String CaptureScreenshot1() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		String basedestfile= ts.getScreenshotAs(OutputType.BASE64);
		Desktop.getDesktop().browse(new File("D:\\Eclipse\\Downloads and extension\\ExtentSparkReport/extreport.png").toURI());
		return basedestfile;
	}
}
