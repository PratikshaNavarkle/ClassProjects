public class Savings extends Account
{
	String branchName;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public double withdrawal(int amt)
	{
		if(bal<1000)
			System.out.println("Insufficent balance,less than 1000,you can not withdraw money");
		else
			bal=bal-amt;
			System.out.println("Withdrawal is successful...!!!");
			System.out.println("Available balance is:"+bal);
		return bal;
	}

	@Override
	public double deposite(int amt) 
	{
		bal=bal+amt;
		System.out.println("Available balance is:"+bal);
		return bal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getCustName()+"\n"+getAccNo()+"\n"+getBal()+"\n"+getBranchName();
	}
	
	
	
	
}