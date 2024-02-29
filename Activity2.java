import java.util.Scanner;

class Mortgage {
    Scanner input;
    double principal;
    double interest;
    double years;
    public Mortgage () {
        input = new Scanner(System.in);   
    }
    public double get_input(String info_type){
        System.out.println("What is the " + info_type + "?");
        double num_input = input.nextDouble();
        return num_input;
    }
    public void get_principal(){
        principal = get_input("Principal");
    }
    public void get_interest(){
        interest = get_input("Annual Interest");
        interest /= 12;
        interest /= 100;
    }
    public void get_years(){
        years = get_input("Amount of Years to Own the Home");
    }
    public double calculate_mortgage(){
        double mortgage =  principal * (interest * Math.pow((1 + interest), years * 12)/(Math.pow((1+interest), years * 12) - 1));
        return mortgage;
    }


}
public class Activity2 {
    public static void main(String[] args) {
        Mortgage mortgageCalc = new Mortgage();
        mortgageCalc.get_principal();
        mortgageCalc.get_interest();
        mortgageCalc.get_years();

        double mortgage = mortgageCalc.calculate_mortgage();
        System.out.println("Your monthly mortgage payment is " + mortgage + " dollars!");
  }
}
