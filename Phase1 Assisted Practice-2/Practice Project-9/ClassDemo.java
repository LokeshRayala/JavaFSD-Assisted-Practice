package multipleinheritance;

interface DemoInterface1 {  
	public default void display() {  
		System.out.println("In DemoInterface1");  
		}  
	}  

interface DemoInterface2  {  
	public default void display()  {  
		System.out.println("In DemoInterface2");  
		}  
	}

// Diamond Problem in Java

public class ClassDemo implements DemoInterface1, DemoInterface2  {  
	public void display()  {  
		DemoInterface1.super.display();  
		DemoInterface2.super.display();  
		}  
	public static void main(String args[])  {  
		ClassDemo obj = new ClassDemo();  
		obj.display();  
		}  
	}  
