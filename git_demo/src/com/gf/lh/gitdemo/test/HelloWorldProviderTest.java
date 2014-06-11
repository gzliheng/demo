package com.gf.lh.gitdemo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gf.lh.gitdemo.HelloWorldProvider;

public class HelloWorldProviderTest {

	@Test
	public void testGetWord() {
		HelloWorldProvider hwp = new HelloWorldProvider();
		//System.out.print(hwp.getWord());
		assertEquals("Hello World!",hwp.getWord());
	}

}
