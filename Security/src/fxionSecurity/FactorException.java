package fxionSecurity;

@SuppressWarnings("serial")
public class FactorException extends Exception{
	public FactorException(String message){
	    super(message);
	  }
	public FactorException(){
		super("Factor Rejected");
	}
}
