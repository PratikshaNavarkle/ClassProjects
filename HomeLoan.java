
public class HomeLoan implements Loan
{
	final int rateOFInterest=12;
	static int period=36;
	
	public static int getPeriod() {
		return period;
	}

	public int getRateOFInterest()
	{
		return rateOFInterest;
	}
	
	@Override
	public void cibilScore(int s,int x) 
	{
		if(s<750)
			System.out.println("Your cibil score is very less");
		else
			System.out.println("Loan is approved......!!!");
		System.out.println("\nTotal amount to be returned including interest is:"+x);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nRate of Interest"+getRateOFInterest()+"\n Tenure:"+getPeriod();
	}

	
}
