package com.packt.java_dl.transfer_learning.video_object_detection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import junit.framework.TestCase;

public class Test extends TestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	public void test() {
		  assertTrue("Se puede acceder al modelo", TinyYoloModel.getPretrainedModel() != null);       
	}

}
