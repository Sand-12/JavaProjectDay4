package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student(18, "Sandeep");
		Student s2 = new Student(14, "bandeep", "abcd @gmail.com");
		System.out.println(s.getRollnumber());
		System.out.println(s.getName());
		s.setEmail("abc@gmail.com");
		System.out.println(s.getEmail());
		System.out.println(s2.getRollnumber());
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());
		System.out.println(s.equals(s2));
		
		
//		s.setEmail("abc@gmail.com");
//		System.out.println(s.getEmail());
	}

}
