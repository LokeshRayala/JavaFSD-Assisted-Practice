package ExceptionHandling;

public class ExceptionDemo2 {
	
	static void check(int age) throws Exception
	{
		if(age<18)
			System.out.println("Not Valid Age For  Voting");
		else
			System.out.println("Valid Age for Voting");
	}

	static void test() throws Exception
	{
		check(12);
	}
	
	public static void main(String[] args) {
		
		 try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //handled using try and catch
		
	}

}
