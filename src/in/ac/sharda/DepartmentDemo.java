package in.ac.sharda;

public class DepartmentDemo {

	public static void main(String[] args) {
		Department d= new Department(10);
		d.add(new Student(1, "Sandeep"));
		d.add(new Student(2,"Abc"));
		d.add(new Student(3, "Sandeep"));
		d.add(new Student(4,"Abc"));
		d.add(new Student(5, "Sandeep"));
		d.add(new Student(6,"Abc"));
		d.add(new Student(7, "Sandeep"));
		d.add(new Student(8,"Abc"));
		d.add(new Student(9, "Sandeep"));
		d.add(new Student(10,"Abc"));
		d.add(new Student(11, "Sandeep"));
		d.add(new Student(12,"Abc"));
		d.add(new Student(13, "Sandeep"));
		d.add(new Student(14,"Abc"));
		d.add(new Student(15, "Sandeep"));
		d.add(new Student(16,"Abc"));
		d.add(new Student(17, "Sandeep"));
		d.add(new Student(18,"Abc"));
		d.add(new Student(19, "Sandeep"));
		d.add(new Student(20,"Abc"));
		d.printStudents();
	}

}
