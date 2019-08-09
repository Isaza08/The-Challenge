package mx.com.bestbuy.capacitacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//esta es la clase que hace que corra el proyecto


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src\\test\\resources\\features\\BestBuy.feature", //le decimos donde se encuentra el archivo .feature
				 glue = "mx.com.bestbuy.capacitacion.stepdefinitions", //especificamos donde van a quedar los stepdefinitions
				 snippets = SnippetType.CAMELCASE) //para que al correr el runner genere los metodos que trae del lenguaje gherkin con el snippet correcto


public class BestBuyRunner {
	
	
	
}
