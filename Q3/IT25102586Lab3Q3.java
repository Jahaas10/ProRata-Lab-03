import java.util.Scanner;

public class IT25102586Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = scanner.nextInt();

        int n5000 = amount / 5000; amount %= 5000;
        int n1000 = amount / 1000; amount %= 1000;
        int n500  = amount / 500;  amount %= 500;
        int n200  = amount / 200;  amount %= 200;
        int n100  = amount / 100;  amount %= 100;
        int n50   = amount / 50;   amount %= 50;
        int n20   = amount / 20;   amount %= 20;
        int c10   = amount / 10;   amount %= 10;
        int c05   = amount / 5;    amount %= 5;
        int c02   = amount / 2;    amount %= 2;
        int c01   = amount;

        System.out.println("\n5000 Notes - " + n5000);
        System.out.println("1000 Notes - " + n1000);
        System.out.println("500 Notes  - " + n500);
        System.out.println("200 Notes  - " + n200);
        System.out.println("100 Notes  - " + n100);
        System.out.println("50 Notes   - " + n50);
        System.out.println("20 Notes   - " + n20);
        System.out.println("10 Coins   - " + c10);
        System.out.println("05 Coins   - " + c05);
        System.out.println("02 Coins   - " + c02);
        System.out.println("01 Coins   - " + c01);

        scanner.close();
    }
}