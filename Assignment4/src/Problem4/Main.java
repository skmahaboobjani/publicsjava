package Problem4;

public class Main {

	public static void main(String[] args) throws LowBalanceException {
		Account a = new Account(1000);
		
		System.out.println(a.withdraw(500));

	}

}