package com.exceptions;

class InsufficientBalanceException extends Exception{
	private String message;
	public InsufficientBalanceException() 
	{ 
		this.message = ""; 
	}
	
	public InsufficientBalanceException(String message) 
	{ 
			super();
			this.message = message; 
	}
	
	public String toString() 
	{
		return "Balance is Insufficient. " + this.message;
	}
}
class Account {
	private static int accBal=2000;
	public static void withDraw(int amtWith) throws InsufficientBalanceException
	{
		if(accBal<amtWith)
		{
			throw new InsufficientBalanceException(); 
		}
		else
		{
			System.out.println("Amount Withdrawed");
			accBal-=amtWith;
		}
	}
}
public class CustomExceptionsTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//try {
		Account.withDraw(820);
		//}
		//catch(Exception e ){
			//e.printStackTrace();
		//}
		Account.withDraw(820);
		Account.withDraw(820);
		Account.withDraw(820);
		
		Account.withDraw(820);
		Account.withDraw(820);
	}
}
