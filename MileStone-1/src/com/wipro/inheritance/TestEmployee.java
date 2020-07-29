package com.wipro.inheritance;

public class TestEmployee {
	public static void main(String args[])
	{
		Employee e=new Employee(75000,2006,"IFS2762273243");
		e.setName("Tejaswini");
		e.setAnnual_salary(65000);
		e.setYear_start(2014);
		System.out.println("Employee Name:"+e.getName());
		System.out.println("Employee Annual Salary:"+e.getAnnual_salary());		
		System.out.println("Employee Year of start to work:"+e.getYear_start());
		System.out.println("Employee National Insurance Number:"+e.getInsurance_no());
	}
}