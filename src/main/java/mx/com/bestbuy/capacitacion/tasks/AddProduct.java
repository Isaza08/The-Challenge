package mx.com.bestbuy.capacitacion.tasks;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import io.vavr.control.Try;
import mx.com.bestbuy.capacitacion.userinterfaces.ProductToCarPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class AddProduct implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		//definimos las tareas que debe de hacer el actor a la hora de agregar un producto en el carrito de compras
		
		actor.attemptsTo(Scroll.to(ProductToCarPage.btnAddToCar), 
				Click.on(ProductToCarPage.btnAddToCar), 
				Click.on(ProductToCarPage.radioSoporte),
				Click.on(ProductToCarPage.btnAddToCar2));
	}

	public static AddProduct toCar() {

		return instrumented(AddProduct.class); //llama al constructor de la clase
	}
	

}
