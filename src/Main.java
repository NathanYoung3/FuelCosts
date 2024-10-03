import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validValue = false;
        double tankCapacity = 0;
        double mpg = 0;
        double gallonCost = 0;
        double pricePer100M = 0;
        double distanceLeft = 0;

        do { //gets user input for the number of gallons in the tank
            System.out.println("Enter Current Number of Gallons of Gasoline in Vehicle:");
            if (scan.hasNextDouble()) {
                tankCapacity = scan.nextDouble();
                if (tankCapacity >= 0) {
                    validValue = true;
                }else {
                    System.out.println("You entered an invalid value for the cost per gallon. Please try again.");
                }
            } else {
                System.out.println("You entered an invalid value for gallons of gas. Please try again.");
            }
            scan.nextLine();
        } while (!validValue);

        validValue = false; //resetting loop condition
        do {//gets user input for the number of miles per gallon
            System.out.println("Enter Fuel Efficiency in MPG:");
            if (scan.hasNextDouble()) {
                mpg = scan.nextDouble();
                if (mpg > 0) {
                    validValue = true;
                }else {
                    System.out.println("You entered an invalid value for the cost per gallon. Please try again.");
                }
            } else {
                System.out.println("You entered an invalid value for MPG. Please try again.");
            }
            scan.nextLine();
        } while (!validValue);

        validValue = false; //resetting loop condition
        do {//gets user input for the price of one gallon of gas
            System.out.println("Enter Current Price for a Gallon of Gas:");
            if (scan.hasNextDouble()) {
                gallonCost = scan.nextDouble();
                if (gallonCost > 0) {
                    validValue = true;
                }else {
                    System.out.println("You entered an invalid value for the cost per gallon. Please try again.");
                }
            } else {
                System.out.println("You entered an invalid value for the cost per gallon. Please try again.");
            }
            scan.nextLine();
        } while (!validValue);

        pricePer100M = 100 / mpg * gallonCost;
        distanceLeft = tankCapacity * mpg;

        System.out.printf("%-15s %10.2f", "Cost per 100 miles in $: ", pricePer100M);
        System.out.printf("\n%-15s %10.2f", "Distance Left in Miles: ", distanceLeft);
    }
}