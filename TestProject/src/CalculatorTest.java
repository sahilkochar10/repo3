import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void test() {
		
		Calculator c = new Calculator();
		assertEquals(120,c.fact(5));
	}

}
