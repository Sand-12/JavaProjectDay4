package in.ac.sharda;

import java.util.Set;
import java.util.TreeSet;

public class University {
	private Set<Department> departments = new TreeSet<>();

	public boolean addDepartment(Department id) {
		return departments.add(id);// Adding a comment
	}

	public void printdepartment() {
		departments.parallelStream().forEach(s -> System.out.println(s.getId()));
	}

	public void Resultdeclared() {
//		for(Department d : departments) {
//			d.resultArrived();
//		}
		departments.parallelStream().forEach(d -> d.resultArrived());
	}

}
