package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService 
{
	public int findNumberOfNullMarksArray(Student s[])
	{
		
		int c=0;
		try
		{
		if(s!=null)
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i].getMarks()==null)
					c++;
			}
		}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		return c;
	}
	public int findNumberOfNullName(Student s[])
	{
		int c=0;
		try
		{
		if(s!=null)
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i].getName()==null)
					c++;
			}
		}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		return c;
	}
	public int findNumberOfNullObjects(Student s[])
	{
		int c=0;
		try
		{
		if(s!=null)
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i]==null)
					c++;
			}
		}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		return c;
	}
}
