import static org.junit.Assert.*;

import org.junit.Test;

public class TesteMedia {

	@Test
	public void testmedia() {
		Media media = new Media();
		
		double valorEsperado = 10;
		double result = media.Media(10, 10);
		
		assertEquals(valorEsperado, result, 0.1);
	}

}
