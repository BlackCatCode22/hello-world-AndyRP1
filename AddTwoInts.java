//This is a comment
/*
* Andy Ramos
* 8/15/2024
* AddTwoInts
 */

import java.util.Scanner;  // Import the Scanner class


public class AddTwoInts {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to the Double Int Program!\n\n");

        int firstNum= 0;
        int secondNUM = 0;
        int sumOfBothNumbers = 0;

        System.out.println("\n TheValue fo sumOfBothNumbers is "+ sumOfBothNumbers);

        //Create a Scanner object
        Scanner MyScannerObject =new Scanner(System.in);

        //Ask User for the first int
        System.out.println("\n Please enter a whole number");
        firstNum = MyScannerObject.nextInt();

         //Unit text for our first user input
        System.out.println("\n The Value of firstNum is: " +firstNum );

        //Ask User for the first int
        System.out.println("\n Please enter a second whole number");
        secondNUM = MyScannerObject.nextInt();

        //Unit text for our second user input
        System.out.println("\n The Value of secondNum is: " +secondNUM );

        //Processing
        //Add the two ints input from the user.
        // the total of firstNum and SecondNum will be stored in
        //the variable named: sumOfBothNumbers

        sumOfBothNumbers = firstNum + secondNUM;

        //output the value of the variable named: sumofBothNumbers
        System.out.println("\n The Value of sumOfBothNumbers is +" + sumOfBothNumbers);

    }
}