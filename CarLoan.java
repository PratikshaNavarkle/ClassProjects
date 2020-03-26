
public class CarLoan implements Loan 
{
	final int rateOfInt=10;
	static int period=36;
	
	
	
	public static int getPeriod() {
		return period;
	}
	
	public int getRateOfInt()
	{
		return rateOfInt;
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
		return "\n Rate of interest"+getRateOfInt()+"\nTenure:"+getPeriod();
	}
	
	
	
}
