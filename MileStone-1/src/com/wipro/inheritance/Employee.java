package com.wipro.inheritance;

public class Employee extends Person
{
	double annual_salary;
	int year_start;
	String insurance_no;
	Employee(double annual_salary,int year_start,String insurance_no)
	{
		this.annual_salary=annual_salary;
		this.year_start=year_start;
		this.insurance_no=insurance_no;
	}
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getYear_start() {
		return year_start;
	}
	public void setYear_start(int year_start) {
		this.year_start = year_start;
	}
	public String getInsurance_no() {
		return insurance_no;
	}
	public void setInsurance_no(String insurance_no) {
		this.insurance_no = insurance_no;
	}	
}
