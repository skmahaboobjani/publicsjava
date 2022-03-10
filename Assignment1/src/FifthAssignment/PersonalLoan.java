package FifthAssignment;


public class PersonalLoan {
	private float loanPerc;
	private double loanAmount;

	private Person person;
	
	public PersonalLoan(float loanPerc, double loanAmount, String name,String city,long phone) {
		this.loanPerc=loanPerc;
		this.loanAmount=loanAmount;

		this.person=new Person(name,city,phone);
	}
	
	public float getLoanPerc() {
		return loanPerc;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanPerc(float loanPerc) {
		this.loanPerc = loanPerc;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	
	public Person getPersonDetails() {
		return this.person;
	}
	
}
