package FifthAssignment;

public class Main {

	


		public static void main(String[] args) {
			PersonalLoan percLoan=new PersonalLoan(0, 3.5% 300000.00,  "mehaboob", "guttikonda", 5463457465L);
			HomeLoan homeLoan=new HomeLoan(18.9f, 2900000.00,  "ravi", "guntur", 7465563738L);
			System.out.println("Percentage: "+percLoan.getLoanPerc()+"%");
			System.out.println("Amount: "+percLoan.getLoanAmount());
			System.out.println("Name: "+percLoan.getPersonDetails().getName());
			System.out.println("Address: "+percLoan.getPersonDetails().getCity());
			System.out.println("Percentage: "+homeLoan.getLoanPerc()+"%");
			System.out.println("Amount: "+homeLoan.getLoanAmount());
			System.out.println("Name: "+homeLoan.getPersonDetails().getName());
			System.out.println("Address: "+homeLoan.getPersonDetails().getCity());
		}
	}


