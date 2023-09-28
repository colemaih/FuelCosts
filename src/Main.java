import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gas, mpg, price;
        final double MIN_GAS = 0, MAX_GAS = 100;
        final double MIN_MPG = 0, MAX_MPG = 100;
        final double MIN_PRICE = 0, MAX_PRICE = 10;

        do {

            System.out.print("Enter the number of gallons of gas in the tank: ");
            gas = input.nextDouble();
            if (gas < MIN_GAS || gas > MAX_GAS) {
                System.out.println("Invalid input. Please enter a number between " + MIN_GAS + " and " + MAX_GAS + ".");
            }
        } while (gas < MIN_GAS || gas > MAX_GAS);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            mpg = input.nextDouble();

            if (mpg < MIN_MPG || mpg > MAX_MPG) {

                System.out.println("Invalid input. Please enter a number between " + MIN_MPG + " and " + MAX_MPG + ".");
            }
        } while (mpg < MIN_MPG || mpg > MAX_MPG); // Repeat until the input is valid

        do {

            System.out.print("Enter the price of gas per gallon: ");
            price = input.nextDouble();
            if (price < MIN_PRICE || price > MAX_PRICE) {

                System.out.println("Invalid input. Please enter a number between " + MIN_PRICE + " and " + MAX_PRICE + ".");
            }
        } while (price < MIN_PRICE || price > MAX_PRICE);


        input.close();

        double cost = price * 100 / mpg;
        double distance = gas * mpg;

        System.out.printf("The cost per 100 miles is $%.2f.\n", cost);
        System.out.printf("The car can go %.2f miles with the gas in the tank.\n", distance);
    }
}