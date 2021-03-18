package com.bridgelabz.payrollDB;

import java.time.LocalDate;
import java.util.List;

public class EmployeePayrollDBService {


	public int id;
	public String name;
	public double salary;
	public LocalDate start;

	/* Constructor */
	public EmployeePayrollDBService(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeePayrollDBService other = (EmployeePayrollDBService) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

	/* Constructor */
	public EmployeePayrollDBService(int id, String name, double salary, LocalDate start) {
		this(id,name,salary);
		this.start = start;
	}
	@Override
	public String toString() {
		return "EmployeePayrollData [ID=" + id + ", Name=" + name + ", Salary=" + salary + ", Start=" + start + "]";
	}

	public List<EmployeePayrollData> readData() {
		// TODO Auto-generated method stub
		return null;
	}

	public static EmployeePayrollDBService getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateEmployeeData(String name2, double salary2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<EmployeePayrollData> getEmployeePayrollData(String name2) {
		// TODO Auto-generated method stub
		return null;
	}
} 