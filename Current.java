public class Current extends Account
{
	int limit;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public double withdrawal(int amt) 
	{
		if(bal<1500)
			System.out.println("Insufficent balance,less than 1500,you can not withdraw money");
		else
			bal=bal-amt;
		System.out.println("Withdrawal is succesful..!!");
		System.out.println("Available balance is:"+bal);
		return bal;
	}

	@Override
	public double deposite(int amt) 
	{
		bal=bal+amt;
		System.out.println("Deposite is succesful");
		System.out.println("Available balance is:"+bal);
		return bal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getCustName()+"\n"+getAccNo()+"\n"+getBal()+"\n"+getLimit();
	}
	
	
}