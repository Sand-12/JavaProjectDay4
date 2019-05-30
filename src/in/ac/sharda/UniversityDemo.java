package in.ac.sharda;

public class UniversityDemo {

	public static void main(String[] args) {
		University u = new University();
		for(int i=0; i<20; i++) {
			if(u.addDepartment(new Department(i))==true)
			{
				System.out.println("Added Successfully");
			}
			else
			{
				System.out.println("Not Added");
			}
		
		}
		u.printdepartment();
		

	}

}
