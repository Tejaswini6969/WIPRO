package com.mile1.main;

import com.mile1.bean.*;
import com.mile1.exception.*;
import com.mile1.service.*;
public class StudentMain
{
static Student data[] = new Student[10];
	
	static {
		for (int i = 0; i < data.length; i++) 
			data [i]= new Student(); 
		
		data [0] = new Student("Sekar", new int[] {35, 35, 35});
		data [1] = new Student(null, new int[] {11, 22, 33});
		data [2] = null;
		data [3] = new Student("Manoj", null);
		data [4] = new Student("John", new int[] {90, 92, 80}); // TC1
		data [5] = new Student("Bob", new int[] {35, 40, 50}); // TC2
		data [6] = new Student("Alice", new int[] {25, 29, 28}); // TC3
		data [7] = null; // TC4
		data [8] = new Student(null, new int[] {25, 29, 28}); // TC5
		data [9] = new Student("Arnold", null); // TC6
		
	}
	
	public static void main(String[] args) {
		StudentReport studentReport = new StudentReport();
		StudentService studentService = new StudentService();
		
		System.out.println("Grade Calculation:");
		
		String x = null;
		
		for (int i = 0; i < data.length; i++)  {
			try {
				x = studentReport.validate(data[i]);
			} catch (NullNameException e) {
				x = "NullNameException occured";
			} catch (NullMarksArrayException e) {
				x = "NullMarksArrayException occured";
			} catch (NullStudentObjectException e) {
				x = "NullStudentException occured";
			}
			
			System.out.println("GRADE = " + x);
		}
		
		System.out.println("Number of Objects with Marks array as null = " +
								studentService.findNumberOfNullMarksArray(data));
		System.out.println("Number of Objects with Name as null = " +
								studentService.findNumberOfNullName(data));
		System.out.println("Number of Objects that are entierly null = " +
								studentService.findNumberOfNullObjects(data));
		
		// TC7
		System.out.println("TC7: Number of Objects with Name as null = " +
				studentService.findNumberOfNullName(data));		
		// TC8
		System.out.println("TC8: Number of Objects that are entierly null = " +
				studentService.findNumberOfNullObjects(data));
		// TC9
		System.out.println("TC9: Number of Objects with Marks array as null = " +
				studentService.findNumberOfNullMarksArray(data));
	}
}
