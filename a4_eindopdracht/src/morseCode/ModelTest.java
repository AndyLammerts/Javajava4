package morseCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModelTest {

	@Test
	void testLeeg() {
		fail("Not yet implemented");
	}
	
	@Test
	void testUpper() {
		Model model = new Model();
		model.setText( "s");
		assertEquals("S", model.getText());
//		fail("Not yet implemented");
	}
	
	@Test
	void testEenLetter() {
		Model model = new Model();
		model.setText("s");
		assertEquals("...", model.getMorse());
	}
	
	@Test
	void testTekst() {
		fail("Not yet implemented");
	}
	
	@Test
	void testSpatie() {
		fail("Not yet implemented");
	}
	
	@Test
	void testFoutKarakter() {
		fail("Not yet implemented");
	}

	
}