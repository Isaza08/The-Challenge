package mx.com.bestbuy.capacitacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;
import mx.com.bestbuy.capacitacion.userinterfaces.BestBuySearchPage;

public class SarchProduct implements Task {
	
    String tvSamsung ;
	
	public SarchProduct(String tvSamsung){
		this.tvSamsung = tvSamsung;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(tvSamsung).into(BestBuySearchPage.searchProduct).thenHit(Keys.ENTER));
	}

	public static SarchProduct the(String tvSamsung) {
	
		return instrumented(SarchProduct.class, tvSamsung);
	}
	

}
