package testcases;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	
	@BeforeTest
	public void ReportSetUp() {
		report = new ExtentReports("ExtendReport.html");
	}
	@BeforeMethod
	public void SetUp(Method method) {
		

		//Step 1: Launch chrome browser and navigate to Simplilearn website
		WebDriverManager.chromedriver().setup();
		
		//start report with the current method running
		test = report.startTest(method.getName());
		test.log(LogStatus.INFO, "Test should be started", "Test case started successfully");
		
		this.driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");

		//Step 2: Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	}
	
	@AfterMethod
	public void FinishTest() {
		System.out.println("quit");
		//end current test
		report.endTest(test);
		this.driver.quit();
	}

	@AfterTest
	public void ReportClean() {
		report.flush();
		report.close();
	}
}