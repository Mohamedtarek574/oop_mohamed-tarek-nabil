import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        System.out.print("Enter a positive integer (0 to stop): ");
        n = input.nextInt();

        while (n != 0) {
            if (n > 0) {
                if (n > largest) {
                    largest = n;
                }

                if (n < smallest) {
                    smallest = n;
                }

                sum += n;
                count++;
            }

            System.out.print("Enter a positive integer (0 to stop): ");
            n = input.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Largest = " + largest);
            System.out.println("Smallest = " + smallest);
            System.out.println("Average = " + average);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        input.close();
    }
}
