package org.test;

import org.testng.annotations.Test;

public class Group1 {

	@Test(groups="regression")
	private void tc5() {
		System.out.println("displays tc5");
	}
	
	@Test(groups="smoke")
	private void tc4() {
		System.out.println("displays tc4");

	}
	@Test(groups="regression")
	private void tc6() {
		System.out.println("displays tc6");	

	}
}
