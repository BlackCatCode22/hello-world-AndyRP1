// ar 8/20/24
/*
 * PayrollProgram.java
 *
 * Input: User's name, weekly hours worked (no hour fractions_ user hourly payrate
 *
 * Processing total weekly pay including overtime if more that 40
 *   hours worked that week
 *
 *  Output:polite greeting to the user and regular pay and overtime
 *
 *
 */
//
import java.util.Scanner;

public class PayrollProgram {
    public static void main(String[] args) {
        System.out.print("\n\n ....Welcome to the Payroll Program....\n\n");
        //Variables used in this program.
        String userName = "";
        int hoursWorked = 0;
        int overtimeHours;
        int payRate;

        double hrlyPayRate = 0.0;
        double weeklyPay = 0.0;
        double overtimePay = 0.0;

        //Say hello to the user and get user pay information.
        //Get the user's name.
        // Create a Scanner objects to get input from the user.
        Scanner myScannerObj = new Scanner(System.in);

        // Get the user's name.
        System.out.println("\n Please enter your name: ");
        userName = myScannerObj.nextLine();

        System.out.println("\n Hello, " + userName + ". I hope you are doing good today.");

        // Get weekly hours worked from the user.
        // Output statement prompting the user for hrs worked
        System.out.println("\n Please enter how many hours ypu worked this week\n(please user whole number):");
        //Use the Scanner object to get input from this prompt.
        //from your Scanner object in a variable

        hoursWorked = myScannerObj.nextInt();

        //Create an output statement to the used echoing the user's input.
        System.out.println("\n Hey " + userName + "you worked " + hoursWorked + " this week!");

        //Processing
        overtimeHours = hoursWorked - 40;
        if (hoursWorked > 40)
            overtimePay = overtimeHours * payRate * 1.5;



    }
        else{
             overtimePay = 0;

 // Calculate weekly regular pay
 if (hoursWorked>40) {
     weeklyPayWithoutOvertime = hrlyPayrate * 40;

}
        }
    {
    }
}