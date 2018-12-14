import java.util.Scanner;
/* This is a program to calculate the gcd of three numbers
   using methods and getting the numbers in the main method using
   scanner package
*/
public class GCD3
{
  // Initialise an instance method
  private static int calculateGCD(int numberOne, int numberTwo,
                                        int numberThree)
  {
     // Use while loop to calculate the gcd of first two numbers
     while(numberOne != numberTwo)
       if(numberOne > numberTwo)
         numberOne -= numberTwo;
       else
         numberTwo -= numberOne;
     // Store the gcd of three numbers in another variable
     int gcdTwonumbers = numberOne;

     // Use while loop again to calculate the gcd of three numbers
     while (gcdTwonumbers != numberThree)
       if(gcdTwonumbers > numberThree)
         gcdTwonumbers -= numberThree;
       else
         numberThree -= gcdTwonumbers;

      // return the value obtained
      return numberThree;
  }// class calculateGCD

  // The main method
  public static void main(String[] args)
  {
    // Use the scanner package to get the three numbers
    Scanner inputScanner = new Scanner(System.in);

    // Print the initial statement
    System.out.println("Enter the three numbers to calculate the gcd");

    int firstNumber = inputScanner.nextInt();
    int secondNumber = inputScanner.nextInt();
    int thirdNumber = inputScanner.nextInt();

    // Print the final result
    int gcdThreeNumbers = calculateGCD(firstNumber,secondNumber,thirdNumber);
    System.out.println("The gcd of three numbers is " + gcdThreeNumbers);

  }// main

}// GCD3
