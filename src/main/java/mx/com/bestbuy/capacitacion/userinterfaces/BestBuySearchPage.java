package mx.com.bestbuy.capacitacion.userinterfaces;



import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class BestBuySearchPage extends PageObject  {
	
	public static final Target searchProduct = Target.the("Search of product").located(By.id("gh-search-input"));
	

}
