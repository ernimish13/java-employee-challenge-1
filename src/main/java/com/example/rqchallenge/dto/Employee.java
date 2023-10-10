package com.example.rqchallenge.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
DTO class for employee
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

	private long id;
	@JsonProperty("employee_name")
	private String employeeName;
	@JsonProperty("employee_age")
	private int employeeAge;
	@JsonProperty("employee_salary")
	private int employeeSalary;
	@JsonProperty("profile_image")
	private String profileImage;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employee_name=" + employeeName + ", employee_age=" + employeeAge
				+ ", employee_salary=" + employeeSalary + ", profile_image=" + profileImage + "]";
	}

}
