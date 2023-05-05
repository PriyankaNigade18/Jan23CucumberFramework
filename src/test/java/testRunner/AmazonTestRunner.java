package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/AmazonTest.feature",
					glue="stepdef",
					tags="@Smoke or @Sanity")
public class AmazonTestRunner {

}
