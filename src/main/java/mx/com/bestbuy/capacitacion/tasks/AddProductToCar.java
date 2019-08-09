package mx.com.bestbuy.capacitacion.tasks;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import mx.com.bestbuy.capacitacion.userinterfaces.ProductToCarPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class AddProductToCar implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Scroll.to(ProductToCarPage.btnAddToCar),
				Click.on(ProductToCarPage.btnAddToCar),
				Click.on(ProductToCarPage.radioSoporte),
				Click.on(ProductToCarPage.btnAddToCar2));
	}

	public static AddProductToCar to() {

		return instrumented(AddProductToCar.class);
	}
	

}
