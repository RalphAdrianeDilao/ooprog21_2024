import java.util.Scanner;

public class warmup_sleepin {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it a Weekday? (true/false): ");
        boolean weekday = scanner.nextBoolean();

        System.out.print("Is it a Vacation day? (true/false): ");
        boolean vacation = scanner.nextBoolean();

        boolean canUserSleepIn = sleepIn(weekday, vacation);

        if(canUserSleepIn) {
            System.out.println("You can sleep in.");
        } else {
            System.out.println("You cannot sleep in.");
        }

        scanner.close();
    }
}
