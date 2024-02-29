import java.util.Scanner;

// Mortgage class to calculate monthly mortgage payment
class Mortgage {
    Scanner input; // Scanner object for user input
    double principal; // Principal amount
    double interest; // Annual interest rate
    double years; // Number of years

    // Constructor to initialize Scanner object
    public Mortgage() {
        input = new Scanner(System.in);
    }

    // Gets user input for principal, interest, and years
    public double get_input(String info_type) {
        System.out.println("What is the " + info_type + "?");
        double num_input = input.nextDouble();
        return num_input;
    }

    // Gets principal amount
    public void get_principal() {
        principal = get_input("Principal");
    }

    // Gets annual interest rate and convert to monthly
    public void get_interest() {
        interest = get_input("Annual Interest");
        interest /= 12; // Convert annual interest to monthly
        interest /= 100; // Convert percentage to decimal
    }

    // Gets number of years
    public void get_years() {
        years = get_input("Amount of Years to Own the Home");
    }

    // Calculates monthly mortgage payment
    public double calculate_mortgage() {
        double mortgage = principal * (interest * Math.pow((1 + interest), years * 12) / (Math.pow((1 + interest), years * 12) - 1));
        return mortgage;
    }
}

// Main class
public class Activity2 {
    // Main method
    public static void main(String[] args) {
        Mortgage mortgageCalc = new Mortgage(); // Create Mortgage object
        mortgageCalc.get_principal(); // Get principal amount
        mortgageCalc.get_interest(); // Get annual interest rate
        mortgageCalc.get_years(); // Get number of years

        // Calculate monthly mortgage payment
        double mortgage = mortgageCalc.calculate_mortgage();

        // Output the monthly mortgage payment
        System.out.println("Your monthly mortgage payment is " + mortgage + " dollars!");
    }
}
