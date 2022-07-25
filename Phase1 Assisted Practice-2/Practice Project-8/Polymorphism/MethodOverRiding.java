package polymorphismDemo;

	
	class parent{
		
		public void test() {
			System.out.println("This is Parent  class Method");
		}
	}

	class Child extends parent{
		
		public  void  test() {
			super.test(); //can call parent method
			System.out.println("This is Child Class Method");
		}
	}

	public class MethodOverRiding {
	
		//in java method overriding occurs when a  subclass (Child class) 
		//has  same method as that of parent
		
		public static void main(String[] args) {
			
			
			Child c= new Child();
			
			c.test();
			
			
			parent p= new parent();
			p.test();
			
			
			 parent p1= new Child();
			
			//this type of initialization is used to access  only the members 
			//present in parent class and methods are  overridden in the child class
			// this is called  up casting
			 p1.test();
		}
		

}
