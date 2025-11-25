import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		assertEquals(21.0, Calculator.add(17, 4));
		assertEquals(17.0, Calculator.add(17, 0));
		assertEquals(18.0, Calculator.add(17, 1));
	}

	@Test
	void testAddNegative() {
		assertEquals(13.0, Calculator.add(17, -4));
		assertEquals(17.0, Calculator.add(17, -0));
		assertEquals(16.0, Calculator.add(17, -1));
	}
	
}
