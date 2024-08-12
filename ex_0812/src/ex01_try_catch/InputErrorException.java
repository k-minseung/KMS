package ex01_try_catch;

public class InputErrorException extends Exception{
	
	public InputErrorException(String messge) {
		super(messge);
	}
}
