package ExceptionHandling;

public class ExceptionDemo3 {
	
	static void check(int age)
	{
		if(age<18)
			throw new ArithmeticException("Not a Valid Age Exception");
		else
			System.out.println("Valid Age for Voting");
	}

	 
	
	public static void main(String[] args) {
		
		 try {
			 check(10);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("Error: "+e);
		}
		 
		 //handled using try and catch
		
	}


}
