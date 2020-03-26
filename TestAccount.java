
import java.util.Scanner;

public class TestAccount 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String rags[])
	{
		
		int ch=0;
		int a=0;
		int TAmt=0;
		int PA=0;
		do
		{
			System.out.println("Account types: 1.Savings   2.Current");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			if(ch==1)
			{
			
					Savings s=new Savings();
					accept(s);
					System.out.println("Enter Branch name");
					s.branchName=sc.next();
					
					do
					{
						System.out.println("Loan: 1.Home Loan 2.Car Loan  3.Withdrawal 4.Deposite 5.Display");
						System.out.println("Enter your choice:");
						ch=sc.nextInt();
						
						switch(ch)
						{
						case 1:
							HomeLoan h=new HomeLoan();
							System.out.println("Rate of interest is:"+h.getRateOFInterest());
							System.out.println("Enter the principal amount");
							PA=sc.nextInt();
							TAmt=PA*h.getRateOFInterest()/100;
							TAmt=TAmt*h.getPeriod()/12;
							TAmt=TAmt+PA;
							
							System.out.println("Enter your cibil Score");
							a=sc.nextInt();
							h.cibilScore(a,TAmt);
						break;
						
						case 2:
							CarLoan c=new CarLoan();
							System.out.println("Rate of interest is:"+c.getRateOfInt());
							System.out.println("Enter the principal amount");
							PA=sc.nextInt();
							TAmt=PA*c.getRateOfInt()/100;
							TAmt=TAmt*c.getPeriod();
							TAmt=TAmt+PA;
							
							System.out.println("Enter your cibil Score");
							a=sc.nextInt();
							c.cibilScore(a,TAmt);
						break;
						
						case 3:
							System.out.println("Enter the amout to be withdrawed");
							int amt=sc.nextInt();
							s.withdrawal(amt);
						break;
						
						case 4:
							System.out.println("Enter amount to be deposited:");
							amt=sc.nextInt();
							s.deposite(amt);
						break;
						
						case 5:
							display(s);
						break;
	
						}
						System.out.println("Do you want to continue for other loan: if yes press 1");
						ch=sc.nextInt();
						
					} while(ch==1);
				
			}
			
			
			else if(ch==2)
			{
				Current p=new Current();
				accept(p);
				System.out.println("Enter limit");
				p.limit=sc.nextInt();
				
				do
				{
					System.out.println("Loan: 1.Home Loan 2.Car Loan  3.Withdrawal 4.Deposite 5.Display");
					System.out.println("Enter your choice:");
					ch=sc.nextInt();
					
					switch(ch)
					{
					case 1:
						HomeLoan h=new HomeLoan();
						System.out.println("Rate of interest is:"+h.getRateOFInterest());
						System.out.println("Enter the principal amount");
						PA=sc.nextInt();
						TAmt=PA*h.getRateOFInterest()/100;
						TAmt=TAmt*h.getPeriod()/12;
						TAmt=TAmt+PA;
						
						System.out.println("Enter your cibil Score");
						a=sc.nextInt();
						h.cibilScore(a,TAmt);
					break;
					
					case 2:
						CarLoan c=new CarLoan();
						System.out.println("Rate of interest is:"+c.getRateOfInt());
						System.out.println("Enter the principal amount");
						PA=sc.nextInt();
						TAmt=PA*c.getRateOfInt()/100;
						TAmt=TAmt*c.getPeriod()/12;
						TAmt=TAmt+PA;
						
						System.out.println("Enter your cibil Score");
						a=sc.nextInt();
						c.cibilScore(a,TAmt);
					break;
					
					case 3:
						System.out.println("Enter the amout to be withdrawed");
						int amt=sc.nextInt();
						p.withdrawal(amt);
					break;
					
					case 4:
						System.out.println("Enter amount to be deposited:");
						amt=sc.nextInt();
						p.deposite(amt);
					break;
					
					case 5:
						display(p);
					break;

					}
					System.out.println("Do you want to continue for other loan: if yes press 1");
					ch=sc.nextInt();
					
				} while(ch==1);
				System.out.println("Do you want to  continue, if yes press 1");
				ch=sc.nextInt();
			}
			System.out.println("Do you want to  continue, if yes press 1");
			ch=sc.nextInt();
		}while(ch==1);	
	}
	
	public static void accept(Account a)
	{
		System.out.println("Enter customer name, Account no, Account bal");
		a.custName=sc.next();
		a.accNo=sc.nextInt();
		a.bal=sc.nextInt();
		
	}
	
	public static void display(Account a)
	{
		System.out.println("-----------------------------------");
		System.out.println(a);
	}
}
