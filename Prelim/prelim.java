import java.util.Scanner;

public class prelim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input nth Fibonacci term: ");
        int n = scan.nextInt();
        System.out.println();
        
        for (int i = 0; i <= n; ++i) {
            System.out.printf("fibonacci(%d) -> ", i);
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
