import Problem4.LowBalanceException;

public class Account2 {

	private double balance;

	public Account2(double balance) {
		this.balance = balance;
	}

	public double checkBalance() {
		return this.balance;
	}

	public double deposit(double amount) {
			this.balance = this.balance + amount;
			return this.balance;
		}

	public double withdraw(double amount) throws LowBalanceException{
			
				
			}
			
			
		}

	}

