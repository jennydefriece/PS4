package PS3_;


public class Test {

	public static void main(String[] args){
		Account accountTest = new Account(1122,20000);
		
		accountTest.deposit(3000);
		accountTest.withdraw(2500);
		accountTest.accessInterest(4.5);
		
		System.out.printf("Balance is: $%.2f",accountTest.getBalance());
		System.out.printf("Monthly Interest Rate is:%.2f%%",(accountTest.getMonthlyInterestRate()));
		System.out.printf("The date the account was created is:", accountTest.accessDate());
		
	accountTest.withdraw(25000000);
		}
}