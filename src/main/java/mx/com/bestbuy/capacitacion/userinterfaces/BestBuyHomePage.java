package mx.com.bestbuy.capacitacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bestbuy.com.mx/") //definimos la URL a la que se va a entrar

public class BestBuyHomePage extends PageObject {
	
	public static final Target searchProduct = Target.the("Search of product").located(By.id("gh-search-input"));
}
