public class Factorial {

 public int factorial(int num) throws Exception {
  if (num < 0) {
   throw new IllegalArgumentException("Factorial is not computed for negative numbers");
  }

  int result = 1;

  for (int i = 2; i <= num; i++) {
   result *= i;
  }

  return result;
 }
}
