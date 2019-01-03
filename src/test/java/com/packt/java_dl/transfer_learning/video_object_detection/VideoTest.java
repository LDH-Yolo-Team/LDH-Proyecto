package com.packt.java_dl.transfer_learning.video_object_detection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
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
	@Disabled
	@DisplayName("Comprobando abrir fichero de vídeo")
	public void testFile() {

		Throwable exception = assertThrows(org.bytedeco.javacv.FrameGrabber.Exception.class, () -> {
			new ObjectDetectorFromVideo().startRealTimeVideoDetection("Wrong path", model);
		});
		assertTrue(exception.getMessage() instanceof String, "La excepción tiene un mensaje");

	}

	@Test
	@Disabled
	@DisplayName("Comprobando JFrame")
	public void testJFrame(){
		ObjectDetectorFromVideo obj = new ObjectDetectorFromVideo();
		obj.createJFrame();
		assertTrue(obj.ventana.isActive() == false, "Ventana activa");
		assertTrue(obj.ventana.isVisible(), "Ventana visible");
		assertTrue(obj.ventana.isResizable(), "Ventana redimensionable");
		assertTrue(obj.ventana.getTitle() != null);
	}

}