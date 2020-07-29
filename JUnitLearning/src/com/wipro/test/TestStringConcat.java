package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat 
{
	@Test
	public void testStringConcat() 
	{
		DailyTasks e= new DailyTasks();
		assertEquals("Teja swini",e.doStringConcat("Teja", "swini"));
	}
}
