import java.util.Scanner;

public class IT25102586Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();

        double total = price * quantity;
        double totalWithDiscount = total * 0.90; // 10% discount applied

        System.out.println("The total amount with 10% discount is: " + totalWithDiscount);

        scanner.close();
    }
}