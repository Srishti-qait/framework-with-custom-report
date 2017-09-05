package com.qait.test;

import org.testng.annotations.Test;

import com.qait.utils.TestSessionInitiator;

public class Gmail_login {
	TestSessionInitiator test= new TestSessionInitiator();
	
	@Test
	public void Test001_GmailLogin() throws InterruptedException{
		test.fk.login();
	}
}
