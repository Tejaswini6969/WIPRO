package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestPresent {

	@Test
	public void test() {
		DailyTasks d2=new DailyTasks();
		assertTrue(d2.checkPresence("Tejaswini", "win"));
	}


}
