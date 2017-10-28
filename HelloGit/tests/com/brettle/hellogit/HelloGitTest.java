package com.brettle.hellogit;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloGitTest {

	@Test
	public void test() {
		HelloGit hg = new HelloGit();
		assertEquals("Adam is actually pretty cool", hg.getMessage());
	}

}
