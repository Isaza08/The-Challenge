package mx.com.bestbuy.capacitacion.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.com.bestbuy.capacitacion.exceptions.NotFoundResult;
import static mx.com.bestbuy.capacitacion.exceptions.NotFoundResult.getNotFoundResultMessagge;


import mx.com.bestbuy.capacitacion.questions.Verification;
import mx.com.bestbuy.capacitacion.tasks.AddProduct;
import mx.com.bestbuy.capacitacion.tasks.OpenTheBrowser;
import mx.com.bestbuy.capacitacion.tasks.Search;
import mx.com.bestbuy.capacitacion.userinterfaces.BestBuyHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BestBuyStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser; //se define el driver
	
	private Actor christopher = Actor.named("Christopher"); //se crea el actor
	
	private BestBuyHomePage bestBuyHomePage;

	@Before
	public void setUp() { //se asocia el driver del navegador al actor
		christopher.can(BrowseTheWeb.with(hisBrowser));
	
	}
		
	@Given("^christopher is in the home page$") //aqui el actor hace la accion de abrir el navegador
	public void christopherIsInTheHomePage() throws Exception {
		christopher.wasAbleTo(OpenTheBrowser.on(bestBuyHomePage));
		
	}
	
	
	@When("^he searchs a \"([^\"]*)\" and adds it in the shop cart$")    //aqui el actor hace las acciones de la compra 
	public void heSearchsAAndAddsItInTheShopCart(String product) throws Exception {
	  christopher.wasAbleTo(Search.the(product));
	  christopher.wasAbleTo(AddProduct.toCar());
	}

	@Then("^he can see the product there \"([^\"]*)\"$") //el actor valida que lo que busco sea lo que le muestra la pagina
	public void heCanSeeTheProductThere(String result) throws Exception {
	  christopher.should(seeThat(Verification.product(), equalTo(result)).orComplainWith(NotFoundResult.class, getNotFoundResultMessagge()));
	}

}
