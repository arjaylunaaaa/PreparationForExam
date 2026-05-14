public class Main {

  public static void main(String[] args) {

    System.out.println("Binary: " + octalToBinary("77"));
  }

  private static String octalToBinary(String octal) {

    String result = "";
    int decimal = 0;
    int power = 0;
    int step = 1;

    System.out.println("Octal: " + octal);
    System.out.println("Convert Octal to Decimal first\n----------------------------------");
    
    for(int i = octal.length()-1; i >= 0; i--) {
      int digit = octal.charAt(i) - '0';
      int value = (int) Math.pow(8, power);
      int addValue = digit * value;
      int oldDecimal = decimal;

      decimal += addValue;
      
      System.out.format("Step %d: %d * 8 ^ %d = %d  (%d + %d = %d)%n", step, digit, power, addValue, oldDecimal, decimal);
      step++;
      power++;
    }
    System.out.format("----------------------------------%nDecimal: %d%n", decimal);

    step = 1;

    while(decimal > 0){
      int remainder = decimal % 2;
      int quotient = decimal / 2;
      System.out.format("Step %d: %d / 2 = %d remainder: %d%n", step, decimal, quotient, remainder);
      result = remainder + result;
      decimal = quotient;
      step++;
    }
    System.out.println("--------------------------------");
    return result;
  }
}
