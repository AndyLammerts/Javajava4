package morseCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModelTest {

	@Test
	void testLeeg() {
		Model model = new Model();
		model.setText("");
		assertEquals("", model.getText());
	}
	
	@Test
	void testUpper() {
		Model model = new Model();
		model.setText( "s");
		assertEquals("S", model.getText());
	}
	
	@Test
	void testEenLetter() {
		Model model = new Model();
		
		assertEquals("...", model.convertChar("S"));
	}
	
	@Test
	void testTekst() {
		Model model = new Model();
		model.setText("SSS");
		assertEquals("... ... ...", model.getMorse());
	}
		
	@Test
	void testSpatie() {
		Model model = new Model();
		model.setText(" ");
		assertEquals("/", model.getMorse());
	}
	
	@Test
	void testFoutKarakter() {
		fail("Not yet implemented");
	}

	
}
