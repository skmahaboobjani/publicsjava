package Problem4;

public class Account {

	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double checkBalance() {
		return this.balance;
	}

	public double deposit(double amount) {
			this.balance = this.balance + amount;
			return this.balance;
		}

	public boolean withdraw(double amount) throws LowBalanceException{
		return false;
			
				
			}
			
			
		}

	

