package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll() {
		List<Department> depList = new ArrayList<>();
		depList.add(new Department(1, "Computers"));
		depList.add(new Department(2, "Notebooks"));
		depList.add(new Department(3, "Smartphones"));
		return depList;
	}
}
