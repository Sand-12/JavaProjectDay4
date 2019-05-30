package in.ac.sharda;

import java.util.Set;
import java.util.TreeSet;

public class University {
	private Set<Department> departments = new TreeSet<>();
	public boolean addDepartment(Department id) {
		return departments.add(id);
	}
	public void printdepartment()
	{
		departments.parallelStream().forEach(s ->System.out.println(s.getId()));
	}

}
