import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class RecursionDemo {
  public static void main(String[] args) {
    int fac_num, fac_result;
    String palin_string, reverse_string, palin_result, reversed_string;
    Scanner scanner = new Scanner(in);
    out.print("Enter a number to find factorial: ");
    fac_num = scanner.nextInt();
    out.print("Enter a string to check palindrome: ");
    palin_string = scanner.next();
    out.print("Enter a string to reverse it: ");
    reverse_string = scanner.next();
    scanner.close();
    fac_result = returnFactorial(fac_num);
    palin_result = returnPalindrome(palin_string);
    reversed_string = returnReverseString(reverse_string);
    out.println("Factorial of " + fac_num + " is " + fac_result);
    out.println("The string " + palin_string + " is " + palin_result);
    out.println("Reverse of " + reverse_string + " is " + reversed_string);
  }

  private static int returnFactorial (int fac_num) {
    int factorial = 0;
    if (fac_num == 0 || fac_num == 1) {
      return 1;
    }
    factorial = fac_num * returnFactorial(fac_num - 1);
    return factorial;
  }

  private static String returnPalindrome (String string) {
    if (string.length() == 0 || string.length() == 1) {
      return "palindrome";
    }
    if (string.charAt(0) == string.charAt(string.length() - 1)) {
      return returnPalindrome(string.substring(1, string.length() - 1));
    }
    return "not palindrome";
  }

  private static String returnReverseString (String string) {
    if (string.isEmpty()) {
      return string;
    }
    return returnReverseString(string.substring(1)) + string.charAt(0);
  }
}