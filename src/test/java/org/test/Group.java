package org.test;

import org.testng.annotations.Test;

public class Group {

	@Test(groups="smoke")
	private void tc1() {
		System.out.println("displays tc1");
	}
	
	@Test(groups="regression")
	private void tc3() {
		System.out.println("displays tc3");

	}
	@Test(groups="smoke")
	private void tc2() {
		System.out.println("displays tc2");	

	}
}
