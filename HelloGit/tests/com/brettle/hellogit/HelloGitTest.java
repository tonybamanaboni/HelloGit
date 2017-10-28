package com.brettle.hellogit;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloGitTest {

	@Test
	public void test() {
		HelloGit hg = new HelloGit();
		assertEquals("We are both cool", hg.getMessage());
	}

}
