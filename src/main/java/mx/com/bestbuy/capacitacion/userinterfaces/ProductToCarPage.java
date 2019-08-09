package mx.com.bestbuy.capacitacion.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductToCarPage extends PageObject {
	
	public static final Target btnAddToCar = Target.the("Button to add the product to car").locatedBy("//div[@id='product-line-item-1000214782']//button[contains(@class,'btn btn-primary btn-sm btn-block btn-leading-ficon')][contains(text(),'Agregar al Carrito')]");
	public static final Target radioSoporte = Target.the("Radio button to add a suport").locatedBy("//strong[contains(text(),'TV 19-')]");
	public static final Target btnAddToCar2 = Target.the("Button to add the product to car").locatedBy("//button[@class='btn btn-md btn-primary add-to-cart']");
	public static final Target cart = Target.the("shop chart").locatedBy("//div[@class='alert alert-success text-center']");
}
