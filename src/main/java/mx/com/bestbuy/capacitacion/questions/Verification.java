package mx.com.bestbuy.capacitacion.questions;



import mx.com.bestbuy.capacitacion.userinterfaces.ProductToCarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verification implements Question <String> {


	@Override
	public String answeredBy(Actor actor) {
		String palabra = Text.of(ProductToCarPage.cart).viewedBy(actor).asString();
		StringBuilder sb = new StringBuilder(palabra);
		
		return sb.toString();
	}
	
	public static Verification product() {
		
		return new Verification();
	}

}
