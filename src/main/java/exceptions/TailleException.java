package exceptions;

public class TailleException extends Exception {

	private static final long serialVersionUID = 9002278645514095867L;

	public static final String EXCEP_TAILLE_MAX = "La pile est déjà pleine";
	
	public TailleException(String msg) {
		super(msg);
	}
}
