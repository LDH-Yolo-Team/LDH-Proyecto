package com.packt.java_dl.transfer_learning.video_object_detection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class VideoTest {

	private static String path;
	private static TinyYoloModel model;

	@BeforeAll
	public static void init() {
		model = TinyYoloModel.getPretrainedModel();
		path = "data/videoSample.mp4";
	}

	@Test
	@DisplayName("Comprobando acceso al modelo")
	public void testModel() {		
		assertTrue(model != null, "Se puede acceder al modelo");
	}

	@Test
	@DisplayName("Comprobando abrir fichero de vídeo")
	public void testFile() {

		Throwable exception = assertThrows(java.lang.Exception.class, () -> {
			new ObjectDetectorFromVideo().startRealTimeVideoDetection(path, model);
			throw new Exception("fichero no válido");
		});
		assertEquals("fichero no válido", exception.getMessage());

	}

}
