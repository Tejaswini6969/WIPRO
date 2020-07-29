package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.*;
public class StudentReport 
{
	public String findGrades(Student studentObject)
	{
		int sum=0;
		int marks[]=studentObject.getMarks();
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<=35)
				return "F";
			else
				sum=sum+marks[i];
		}
		if(sum!=0)
		{
			if(sum<150)
				return "C";
			else if(sum<200)
				return "B";
			else if(sum<250)
				return "A";
			else
				return "A+";
		}
		else
			return "";
	}
	public String validate(Student s) throws NullNameException,NullMarksArrayException,NullStudentObjectException
	{
		if(s==null)
			throw new NullStudentObjectException();
		else
		{
			if(s.getName()==null)
				throw new NullNameException();
			else if(s.getMarks()==null)
				throw new NullMarksArrayException();
			else
				return "VALID";
		}
	}
}
