package com.exceptions;


class MyAutoClosable implements AutoCloseable 
{
	@Override
	public void close() throws Exception 
	{
		System.out.println("MyAutoClosable closed!");
	}
}
public class AutoCloseableTest {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		int x=10,y=0;
		try(MyAutoClosable c=new MyAutoClosable()) {
			int div=x/y;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
