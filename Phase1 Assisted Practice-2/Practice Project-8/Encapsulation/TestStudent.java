package EncapsulationDemo;

public class TestStudent {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setId(1);
		s.setName("Lokesh Rolex");
		s.setEmail("Lokesh@gmail.com");
		s.setPassword("1209");
		s.setMobile("9988776655");
		s.setDivision("A");
		
		System.out.println("Id: "+s.getId()+"\nName: "+s.getName()+"\nEmail: "+s.getEmail()+"\nPassword: "+s.getPassword()+"\nMobile: "+s.getMobile()+"\nDivision:"+s.getDivision());
		
		
		System.out.println(s);
	}

}
