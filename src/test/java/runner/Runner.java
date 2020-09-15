package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Cucumber_practice\\Cucumber_001\\feature",glue={"stepDefination"}
)

public class Runner {

}
