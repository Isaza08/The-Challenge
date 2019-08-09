package mx.com.bestbuy.capacitacion.tasks;


import net.serenitybdd.core.pages.PageObject;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;



public class OpenTheBrowser implements Task  {
	
	private PageObject page;
	
	public OpenTheBrowser(PageObject page){
		this.page=page;
		
	}
	
	@Override
	@Step("{0} abre el navegador en la pagina principal de BestBuy")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
	}

	public static OpenTheBrowser on(PageObject page) {
		
		return instrumented(OpenTheBrowser.class, page);
	}

	



}
