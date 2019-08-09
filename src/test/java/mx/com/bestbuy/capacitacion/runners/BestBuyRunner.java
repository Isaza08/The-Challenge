package mx.com.bestbuy.capacitacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\BestBuy.feature",
				 glue = "mx.com.bestbuy.capacitacion.stepdefinitions",
				 snippets = SnippetType.CAMELCASE)

public class BestBuyRunner {
	
	
	
}
