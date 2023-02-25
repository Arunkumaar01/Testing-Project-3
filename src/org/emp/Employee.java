package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	private void empName() {
		System.out.println("Ruthramurthi");
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empName();
		Client cli=new Client();
		cli.clientName();
		Company com=new Company();
		com.companyName();
		Project pro=new Project();
		pro.projectName();
	}
}
