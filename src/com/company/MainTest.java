package com.company;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	//tests for find weight function
	@Test
	public void overweightmsgtest() {
		var msg=new Main();
		assertEquals("You are overweight",msg.findmsg(25));
	}
	@Test
	public void obesemsgtest() {
		var msg=new Main();
		assertEquals("You are Obese",msg.findmsg(30));
	}
	@Test
	public void normalmsgtest() {
		var msg=new Main();
		assertEquals("Congratulations! You are normal",msg.findmsg(18.5));
	}
	@Test
	public void underweightmsgtest() {
		var msg=new Main();
		assertEquals("You are underweight",msg.findmsg(0));
	}
	
	//tests for find height function
	@Test
	public void heighttest() {
		var height=new Main();
		assertEquals(71.12,height.findheight(2,4),0.0);
	}

	//tests for find bmi function
	@Test
	public void bmitest() {
		var bmi=new Main();
		assertEquals(10000,bmi.findbmi(25,5),0);
	}

}
