import java.util.Scanner;

public class CurrencyConverter {

   
    public static double convertCurrency(String from, String to, double amount) {

        double rate ;

    
        if (from.equalsIgnoreCase("USD") && to.equalsIgnoreCase("INR")) {
            rate = 83.0;
        } else if (from.equalsIgnoreCase("INR") && to.equalsIgnoreCase("USD")) {
            rate = 0.012;
        } else if (from.equalsIgnoreCase("USD") && to.equalsIgnoreCase("EUR")) {
            rate = 0.92;
        } else if (from.equalsIgnoreCase("EUR") && to.equalsIgnoreCase("USD")) {
            rate = 1.08;
        } else if (from.equalsIgnoreCase("INR") && to.equalsIgnoreCase("EUR")) {
            rate = 0.011;
        } else if (from.equalsIgnoreCase("EUR") && to.equalsIgnoreCase("INR")) {
            rate = 90.0;
        } else {
            System.out.println("Conversion not supported.");
            return -1;
        }

        return amount * rate;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("=== Currency Converter ===");
        System.out.print("Enter source currency (USD, INR, EUR): ");
        String from = scanner.nextLine();

        System.out.print("Enter target currency (USD, INR, EUR): ");
        String to = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        
        double result = convertCurrency(from, to, amount);

        if (result != -1) {
            System.out.println("Converted Amount: " + result + " " + to.toUpperCase());
        }

        scanner.close();
    }
}