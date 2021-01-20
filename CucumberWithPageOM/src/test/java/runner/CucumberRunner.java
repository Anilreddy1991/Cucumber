package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"../CucumberWithPageOM/Features/"},glue={"stepdefinitions"},monochrome=true,strict=true,tags="@smoke")
public class CucumberRunner {

}
