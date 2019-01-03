package com.packt.java_dl.transfer_learning.video_object_detection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class TestODFV extends TestCase {

	private static TinyYoloModel yolo;

	@BeforeClass
	public static void setUpBeforeClass() {
		yolo = TinyYoloModel.getPretrainedModel();
	}

	@AfterClass
	public static void tearDownAfterClass() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void testGPM() {
		  assertTrue("Se puede acceder al modelo", TinyYoloModel.getPretrainedModel() != null);       
	}
	
	/*@Test
	public void testGS() {
		assertTrue("Se puede acceder al summary", yolo.getSummary() instanceof String );
	}*/

}
