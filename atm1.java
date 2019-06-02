import java.util.*;
import java.lang.*;
class Atm
{
	String ex_c_no="8008443937";//card number is 8008443937
	String number="8********37";
	String name="ABC";
	Atm()
	{
		int pin,ex_pin=0000;//pin number is 0000
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Card Number: ");
		String c_no=s.next();
		if(c_no.equals(ex_c_no))
		{
			System.out.println("Enter Your Pin Number: ");
			pin=s.nextInt();
			if(pin==ex_pin)
			{
				menu();
		    }
		}
	}
	void menu()
	{
		int choice,ch,ex_amount=100000;
		Scanner m=new Scanner(System.in);
		do
		{
			System.out.println("WELCOME TO ABC BANK\n1.WITHDRAWL\n2.DEPOSIT\n3.BALANCE ENQUIRY\n4.MINI STATEMENT\n5.LOGOUT\nEnter Your Choice: ");
		    ch=m.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter the amount: ");
				        int amount=m.nextInt();
						if(amount>ex_amount)
						{
							System.out.println("amount exceeded");
						}
						else
						{
							ex_amount-=amount;
							mini_st(ex_amount);
						}
						break;
				case 2: System.out.println("Enter the Amount to be deposited: ");
				        amount=m.nextInt();
						ex_amount+=amount;
						mini_st(ex_amount);
						break;
						
			    case 3: System.out.println("Balance: "+ex_amount);
				        break;
				case 4: mini_st(ex_amount);
				        break;
				case 5: System.exit(0);
				        break;
				default: System.out.println("Invalid Choice Entered");
			}
		    System.out.println("Do you want to continue yes(1)/no(0)");
			choice=m.nextInt();
		}while(choice>0);
	}
	void mini_st(int a)
	{
		System.out.println("\tABC BANK\t\nNAME: "+name+"\t\nCARD NO: "+number+"\t\nBALANCE: "+a);
	}
	public static void main(String args[])
	{
		Atm A=new Atm();
	}
}