package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//conduit.feature",
		glue= {"stepDefs"},
		dryRun =false,
		monochrome=true,
		plugin = {"pretty","html:target/reports/HtmlReport.html",
				"rerun:target/failedScenarios.txt",
				"usage:target/reports/UsageReport",
				"json:target/reports/JsonReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)

public class MyTestRunner extends AbstractTestNGCucumberTests {
  @Test
  public void f() {
	  
  }
}
