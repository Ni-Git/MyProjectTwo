package ChromeTwo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentOne {

	
	@Test
	public void logintest() {
		// TODO Auto-generated method stub
  
		System.out.println("Login in amazon");
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/learn_automation.html");
		ExtentReports extent = new ExtentReports(); // it's main class which generate report for you
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("LoginTest");
		logger.log(Status.INFO, "Login to amazon");
		logger.log(Status.PASS, "Title verified");
		extent.flush();		
	}

}

