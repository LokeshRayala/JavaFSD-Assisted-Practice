package polymorphismDemo;

public class MethodOverloading {
	public int sum(int x , int y) {
		return x+y;
	}
	
	public int sum(int x,int y,int z) {
		
		return x+y+z;
	}
	
	public static void main(String[] args) {
		
		MethodOverloading m=  new MethodOverloading();
		System.out.println("Sum: "+m.sum(5, 6));
		System.out.println("Sum: "+m.sum(5, 7, 8));
		
	}

}
