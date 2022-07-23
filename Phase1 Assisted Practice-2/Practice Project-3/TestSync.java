package syncronization;

public class TestSync {
	
public static void main(String[] args) {
		
		Sender sender = new  Sender();
		
		User t1= new User("Person-1", "Hello Good morning....!", sender);
		User t2= new User("Person-2","Hii!! how  are you?",sender);
		
		t1.start();
		t2.start();
	}


}
