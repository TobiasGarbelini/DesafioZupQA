package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features\\TesteDesafioZupAmericanas.feature" ,
		glue = "steps",
		tags = "@fluxoPadrao",
		plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cucumber.xml"},
		monochrome = true
		)
public class Runner {

}
