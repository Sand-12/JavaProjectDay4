package in.ac.sharda;

public class UniversityDemo {

	public static void main(String[] args) {
		University u = new University();
		for(int i=0; i<20; i++) {
			Department d = new Department(i);
			if(u.addDepartment(d))
			{
				System.out.println("Added Successfully");
				for(int j = 1; j < 21; j++ ) {
					d.add(new Student(i, "Name"+i));
				}
			}
			else
			{
				System.out.println("Not Added");
			}
		
		}
		u.printdepartment();
		u.Resultdeclared();
		

	}

}
