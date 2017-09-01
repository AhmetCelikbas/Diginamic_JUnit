package exceptions;

public class PeekException extends Exception {
	
	private static final long serialVersionUID = 4118866511785580512L;

	public static final String EXCEP_PILE_VIDE = "La pile est vide";
	
	public PeekException(String msg) {
		super(msg);
	}
}
