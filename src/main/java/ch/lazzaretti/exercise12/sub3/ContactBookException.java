package ch.lazzaretti.exercise12.sub3;

public class ContactBookException extends Exception {
	private static final long serialVersionUID = 7275816053139408272L;

	public ContactBookException(String description) {
		super(description);
	}
}