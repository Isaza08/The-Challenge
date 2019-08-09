package mx.com.bestbuy.capacitacion.stepdefinitions;

import org.openqa.selenium.WebDriver;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.com.bestbuy.capacitacion.questions.Verification;
import mx.com.bestbuy.capacitacion.tasks.AddProductToCar;
import mx.com.bestbuy.capacitacion.tasks.OpenTheBrowser;
import mx.com.bestbuy.capacitacion.tasks.SarchProduct;
import mx.com.bestbuy.capacitacion.userinterfaces.BestBuyHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class BestBuyStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor christopher = Actor.named("Christopher");
	
	private BestBuyHomePage bestBuyHomePage;
	
	
	@Before
	public void setUp() {
		christopher.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
	}
		
	@Given("^christopher is in the home page$")
	public void christopherIsInTheHomePage() throws Exception {
		christopher.wasAbleTo(OpenTheBrowser.on(bestBuyHomePage));
		
	}
	
	
	@When("^he search a \"([^\"]*)\" and adds it in the shop cart$")
	public void heSearchAAndAddsItInTheShopCart(String arg1) throws Exception {
	  christopher.wasAbleTo(SarchProduct.the(arg1));
	  christopher.wasAbleTo(AddProductToCar.to());
	}

	@Then("^he can see the product there$")
	public void heCanSeeTheProductThere() throws Exception {
	  christopher.should(seeThat(Verification.product(), equalTo("Samsung - Pantalla De 32\" - Plana - HD - Negro Se Agregó Al Carrito.")));
	}
}
