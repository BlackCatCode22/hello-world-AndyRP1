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

public class WarmUp {
    public static void main(String[] args) {
        System.out.print("\n\n ....Welcome to the Payroll Program....\n\n");

        // Variables used in this program.
        String userName;
        int hoursWorked;
        double hrlyPayRate; // Changed from int to double for precision
        double weeklyPay;
        double overtimePay;
        int overtimeHours;

        // Create a Scanner object to get input from the user.
        Scanner myScannerObj = new Scanner(System.in);

        // Get the user's name.
        System.out.println("\n Please enter your name: ");
        userName = myScannerObj.nextLine();

        System.out.println("\n Hello, " + userName + ". I hope you are doing good today.");

        // Get weekly hours worked from the user.
        System.out.println("\n Please enter how many hours you worked this week\n(please use a whole number):");
        hoursWorked = myScannerObj.nextInt();

        // Get hourly pay rate from the user.
        System.out.println("\n Please enter your hourly pay rate (in dollars):");
        hrlyPayRate = myScannerObj.nextDouble();

        // Processing
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * hrlyPayRate * 1.5; // Overtime pay at 1.5 times the regular rate
            weeklyPay = (40 * hrlyPayRate) + overtimePay; // Total weekly pay includes regular and overtime pay
        } else {
            // Calculate pay for hours worked without overtime
            overtimePay = 0;
            weeklyPay = hoursWorked * hrlyPayRate;
        }

        // Output the results
        System.out.println("\n Hey " + userName + ", here's your payroll information for this week:");
        System.out.println(" Regular Pay: $" + (hoursWorked > 40 ? (40 * hrlyPayRate) : (hoursWorked * hrlyPayRate)));
        System.out.println(" Overtime Pay: $" + overtimePay);
        System.out.println(" Total Weekly Pay: $" + weeklyPay);
        
    }
}