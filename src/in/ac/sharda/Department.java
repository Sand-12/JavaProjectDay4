package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public class Department implements Comparable<Department> {
	private List<Student> list=new ArrayList<>();
	private final int id;
	public Department(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void add(Student student) {
		
		this.list.add(student);
	}
	public void printStudents() {
		list.parallelStream().forEach(s -> System.out.println(s.getRollnumber()));
		
	}
	public boolean equals(Object o) {
		if (o instanceof Department) {
			return ((Department)o).getId()==id;
		}
		return false;
	}
	public int compareTo(Department o) {
		return o.getId() -id;
	}
	

}


