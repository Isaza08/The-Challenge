package mx.com.bestbuy.capacitacion.questions;



import mx.com.bestbuy.capacitacion.userinterfaces.ProductToCarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verification implements Question <String> {


	@Override
	public String answeredBy(Actor actor) { 
		//se hace la question para comparar lo que nos muestra en la pantalla con lo que debia de mostrar
		
		String palabra = Text.of(ProductToCarPage.cart).viewedBy(actor).asString();
		StringBuilder sb = new StringBuilder(palabra); 
		
		return sb.toString();
	}
	
	public static Verification product() {
		
		return new Verification(); 
	}

}
