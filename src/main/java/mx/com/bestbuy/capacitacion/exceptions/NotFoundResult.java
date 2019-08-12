package mx.com.bestbuy.capacitacion.exceptions;

public class NotFoundResult extends AssertionError {
	
	private static final String notFoundResult = "Búsqueda sin resultados";
	
	public static String getNotFoundResultMessagge() {
		return notFoundResult;
	}
	
	public NotFoundResult(String message, Throwable cause) {
		super(message, cause);
		
	}

}
