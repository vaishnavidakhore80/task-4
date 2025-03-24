import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Supported currencies:");
        System.out.println("1. Indian Rupee (INR) to US Dollar (USD)");
        System.out.println("2. US Dollar (USD) to Indian Rupee (INR)");
        System.out.println("3. Indian Rupee (INR) to Euro (EUR)");
        System.out.println("4. Euro (EUR) to Indian Rupee (INR)");
        
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        double convertedAmount = 0.0;

        switch (choice) {
            case 1: // INR to USD
                convertedAmount = amount * 0.012; // Approximate conversion rate
                System.out.println(amount + " INR is equal to " + convertedAmount + " USD.");
                break;
            case 2: // USD to INR
                convertedAmount = amount * 83.0; // Approximate conversion rate
                System.out.println(amount + " USD is equal to " + convertedAmount + " INR.");
                break;
            case 3: // INR to EUR
                convertedAmount = amount * 0.011; // Approximate conversion rate
                System.out.println(amount + " INR is equal to " + convertedAmount + " EUR.");
                break;
            case 4: // EUR to INR
                convertedAmount = amount * 90.0; // Approximate conversion rate
                System.out.println(amount + " EUR is equal to " + convertedAmount + " INR.");
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid option.");
        }

        scanner.close();
    }
}
