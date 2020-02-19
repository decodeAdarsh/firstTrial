/**
 * 
 */
package com.exceptions;

/**
 * @author adars
 *
 */
public class ExceptionsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=0;
		try {
			int division = x / y;
			/*try {
				int ary[] = new int[5];
				ary[1] = 34;
			}
			catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			}*/
		}
		/*catch(ArithmeticException e) {
			e.printStackTrace();
		}*/
		finally
		{
			System.out.println("Entered Final");
		}

	}

}
