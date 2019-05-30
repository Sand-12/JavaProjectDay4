package in.ac.sharda;

public class Student {
	
	private final int rollnumber;
	private final String name;
	private String email;
	
	public Student(int rn,String name) {
		this.rollnumber = rn;
		this.name = name;
	}
	public Student(int rn,String name, String email) {
		this.rollnumber = rn;
		this.name = name;
		this.email = email;
	}
	
	public void attendance() {
		System.out.println("Attendance present");
	}
	
	public int getRollnumber() {
		return rollnumber;
	}
	public String getName() {
		return name;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			
			return((Student)obj).getRollnumber()==rollnumber;
		}
		return false;
	}
//	public void setRollnumber(int rn) {
//		this.rollnumber = rn;
//	}

}
