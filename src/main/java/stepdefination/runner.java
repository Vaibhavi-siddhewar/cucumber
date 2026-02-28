package stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="cucumber_feature/ohrmlogin.feature",glue="stepdefination")
public class runner {

}
