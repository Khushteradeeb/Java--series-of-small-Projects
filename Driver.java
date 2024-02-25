package InvestmentEarning;

import java.util.Scanner;
import java.text.*;
public class Driver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price");                   // let enter user a buying price
        double buyingPrice = scan.nextDouble();                          // a variable to store a value coming from "scan" object
        int day = 1;                                                     // need to keep track of the days
        double closingPrice = 0.1;                                       // closing price
        DecimalFormat df = new DecimalFormat("0.00");             // Decimal format class provided by java " df is object reference variable "
        while (true)                                                     // need an endless loop until some condition is met to leave it. So I can use the while(true) approach
        {
            System.out.println("Enter the closing price for day" +
                    day + " (any negative value to leave: )");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) break;                               // if you will enter a negative price you are going to leave program
            double earning = closingPrice - buyingPrice;                 // if closing price is +ve means there is earning
            if (earning > 0){
                System.out.println("After day " +day+ ", you earned "    // if earning is +ve means you earned
                       + df.format(earning) +" per share. ");
            }
            else if (earning < 0.0) {
                System.out.println("After day " + day + ", you lost " +   // if earning is -ve means you lost
                        df.format(-earning) +" per share. ");
            }
            else {
                System.out.println("After day " + day + ", you have " +   // if earning is = to zero ( 0 ) means no earning
                        "no earning per share. ");
            }
            day += 1;                                                     // day index will be incremented to show next days
        }
        scan.close();                                                     // closing the scan object
    }

}
