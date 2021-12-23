package com.example.Demo.DTO;

public class EmployeePayrollDTO {

	public long id;
	public String name;
	public long salary;
	
	public EmployeePayrollDTO(long id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + "\n" +"name=" + name +"\n "+"salary=" + salary + "\n";
	}

}
