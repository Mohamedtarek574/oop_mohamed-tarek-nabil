import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits = " + sum);

        input.close();
    }
}
