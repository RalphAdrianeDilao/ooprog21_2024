import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int first = scan.nextInt();
        System.out.print("Input the second number: ");
        int second = scan.nextInt();
        System.out.print("Input the third number: ");
        int third = scan.nextInt();

        if (first < second && second < third) {
            System.out.println("Input is already in ascending order. Printing in ascending order.");
            System.out.printf("Ascending Order: %d, %d, %d", first, second, third);
        } else {
            System.out.println("Printing in descending order.");
            int temp;

            if (third > second) {
                temp = second;
                second = third;
                third = temp;
            }

            if (third > first) {
                temp = first;
                first = third;
                third = temp;
            }

            if (second > first) {
                temp = first;
                first = second;
                second = temp;
            }

            System.out.printf("Descending Order: %d, %d, %d", first, second, third);
        }
    }
}
