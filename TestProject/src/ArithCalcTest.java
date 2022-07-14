import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class ArithCalcTest {

	@Test(expected=ArithmeticException.class)
	public void testCalc() {
		ArithCalc a=new ArithCalc();
		a.calc(2,2);
	}

}
