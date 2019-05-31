package in.ac.sharda;

public class Student implements IResultArrivedListener{
	
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
	
//	public void resultArrived() {
//		System.out.println("Result Just Came In");
//	}
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
//@Override
//public void resultArrived() {
//	// TODO Auto-generated method stub
//	
//}
//	@Override
//	public void resultArrived() {
//		// TODO Auto-generated method stub
@Override
public void resultArrived() {
	System.out.println("Hey result is out - go checkc it"+name);
	
}
		
//	}
//	@Override
//	public void resultArrived1() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void resultArrived2() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void resultArrived3() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void resultArrived4() {
//		// TODO Auto-generated method stub
//		
//	}

}
