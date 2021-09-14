/*
This program takes in your prinipal investment, annual interest rate and
desired ending value. It then calculates and tells the user how many 
years it will take for the initial deposit to reach the ending value, 
whereas the interest is compounded annually
 */
package agrawalcdcalculator;
import java.util.Scanner;

public class AgrawalCDcalculator {

    public static void main(String[] args) {
        
        System.out.println("CD Calculator");
        
        //Initialize new Scanner object
        Scanner keyedInput = new Scanner(System.in);
        
        //Develop and initialize variables (values provided by the user) 
        System.out.print("Enter initial investment ($): ");
        double cdVal = keyedInput.nextInt();
        System.out.print("Enter annual interest rate (%): ");
        double interest = keyedInput.nextInt();
        System.out.print("Enter desired ending value ($): ");
        double endVal = keyedInput.nextInt();
        
        //This variable will count the number of years it will take 
        int counter = 0;
        //This variables is the value by which the investment is increased every year
        double growthFactor = 1 + interest/100;
        
        //The number of times this loop iterates is the number of years it takes
        do{
            cdVal = cdVal * growthFactor;
            counter = counter+1;
        }while(cdVal < endVal);
        
        //Finally prints out the answer 
        System.out.println("This investment requires " + counter + " years");
    }
}
