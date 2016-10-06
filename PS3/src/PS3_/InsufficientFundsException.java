package PS3_;

public class InsufficientFundsException extends Exception {
	private double amount;
	
	public void InsuffientFundsException(double amount){
		this.amount=amount;
	}
	
public double getAmount() {
	return amount;
}
}
