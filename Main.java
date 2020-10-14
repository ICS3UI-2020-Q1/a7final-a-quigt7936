import java.util.Scanner;
/**
 * The program tells the user how many 1 digits it has
 * @author Thomas Quigley
 */
public class Main {
  // tells how many 1's are in a number
  public static void oneDigits(int userNumber) {
    // create the variable that counts the ones 
    int countOnes = 0;

    // a while loop that stops when all the digits of the number have been checked
    while (userNumber > 0) {
     // create a variable that is the users number but without the last digit
      int oneOrNot = userNumber;

      // divide oneOrNot by 10 then multiple so the last digit is 0
      oneOrNot = oneOrNot / 10;
      oneOrNot = oneOrNot * 10;

      // create the last digit variable
      int lastDigit;

      // if oneOrNot is 0 then the userNumber is the last digit
      if (oneOrNot == 0) {
        lastDigit = userNumber;
      } else {
        // get the value of the last digit
        lastDigit = userNumber % oneOrNot;
      }
      // check if the last digit is 1
      if (lastDigit == 1) {
        countOnes = countOnes + 1;
      }
      // divide by 10 and go onto the next number
      userNumber = userNumber / 10;
    }
    // tell the user how many ones there are in their number
    System.out.println("There are " + countOnes + " ones in your number.");
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask the user for their number
    System.out.println("What number would you like to test?");
    int userNumber = input.nextInt();

    // peform method oneDigits
    oneDigits(userNumber);
    
  }
}
