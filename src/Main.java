public class Main {
    public static void main(String[] args) {

        System.out.print("What is the price of your item? " );
        double itemPrice = 100;

        double salesTax = itemPrice * 0.05;

        System.out.println("The sales tax is " + salesTax);
    }
}