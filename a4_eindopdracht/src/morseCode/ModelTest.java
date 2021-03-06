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
		
		assertEquals("...", model.convertChar('s'));
	}
	
	@Test
	void testTekst() {
		Model model = new Model();
		model.setText("sss");
		assertEquals("... ... ... ", model.getMorse());
	}
		
	@Test
	void testSpatie() {
		Model model = new Model();
		model.setText("");
		assertEquals("/", model.convertChar(' '));
	}
	
	@Test
	void testFoutKarakter() {
		Model model = new Model();
		assertEquals("Dit teken is niet beschikbaar", model.convertChar('@'));
	}

	
}
