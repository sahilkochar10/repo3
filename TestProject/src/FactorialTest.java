import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Test cases follow below naming convention. methodName_input_output format.

 *
 */
@RunWith(Parameterized.class)
public class FactorialTest {
 private int input;
 private int expectedResult;

 private Factorial fact;

 @Before
 public void init() {
  fact = new Factorial();
 }

 @Parameterized.Parameters
 public static Iterable<Object[]> data() {
  return Arrays.asList(new Object[][] { { 0, 1 }, { 1, 1 }, { 5, 120 }, { 10, 3628800 } });
 }

 public FactorialTest(int input, int expectedResult) {
  this.input = input;
  this.expectedResult = expectedResult;
 }

 @Test
 public void testFactorial() throws Exception {
  int output = fact.factorial(input);
  assertEquals(expectedResult, output);
 }

}