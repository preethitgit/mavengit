package org.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//Method1- should be created before a class
//@RunWith(Suite.class)
//To execute multiple claases in @Suiteclasses --mention it in {}
//@SuiteClasses({Executable.class,SuiteJunit.class})
public class RunnerClassSuite {

	@Test
	public void tc() {
		//Method2 -should always be created after a class
		Result r = JUnitCore.runClasses(Executable.class,SuiteJunit.class);
		
		System.out.println("Failure count is " +r.getFailureCount());
		System.out.println("Ignore count is " +r.getIgnoreCount());
		System.out.println("Run count is " +r.getRunCount());
		System.out.println("Run time is " +r.getRunTime());
		
		
		
	
	}
}
