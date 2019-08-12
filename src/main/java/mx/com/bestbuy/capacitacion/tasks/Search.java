package mx.com.bestbuy.capacitacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;


import mx.com.bestbuy.capacitacion.userinterfaces.BestBuyHomePage;


public class Search implements Task {
	
    String product ; //definimos la variable que trae el parametro que colocamos en el archivo .feature
	
	public Search(String product){ //constructor para el parametro
		this.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(product).into(BestBuyHomePage.searchProduct).thenHit(Keys.ENTER)); //tarea donde se ingresa el producto que se va a buscar
	}

	public static Search the(String product2) {
	
		return instrumented(Search.class, product2); //llama al constructor de la clase
	}
	

}
