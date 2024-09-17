import java.util.Scanner;

class Farmer
{
	float principalAmount;
	float timeDuration;
	static float interestRate;
	float simpleInterest;
	
	static
	{
		interestRate=2.5f;
	}
	
	void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the amount for Loan in Euro");
		principalAmount=scan.nextFloat();
		System.out.println("Pleasr Enter the time duration to repay the loan in months");
		timeDuration=scan.nextFloat();
	}
	
	void compute()
	{
		simpleInterest=((principalAmount*timeDuration*interestRate)/100.0f);
	}
	
	void disp()
	{
		System.out.println("Your Simple Interest is:" +simpleInterest + "€");
	}

}
public class FarmerLoan {

	public static void main(String[] args) {
		Farmer f1=new Farmer();
		System.out.println("Farmer 1: ");
		f1.acceptInput();
		f1.compute();
		f1.disp();
		
		Farmer f2=new Farmer();
		System.out.println("Farmer 2: ");
		f2.acceptInput();
		f2.compute();
		f2.disp();
		
		Farmer f3=new Farmer();
		System.out.println("Farmer 3: ");
		f3.acceptInput();
		f3.compute();
		f3.disp();
	}

}

