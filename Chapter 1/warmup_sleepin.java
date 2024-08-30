import java.util.Scanner;

public class warmup_sleepin {
    public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
        return !isWeekday || isVacation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it a weekday? (true/false): ");
        boolean isWeekday = scanner.nextBoolean();

        System.out.print("Is it a vacation day? (true/false): ");
        boolean isVacation = scanner.nextBoolean();

        boolean canUserSleepIn = sleepIn(isWeekday, isVacation);

        if(canUserSleepIn) {
            System.out.println("You can sleep in.");
        } else {
            System.out.println("You cannot sleep in.");
        }

        scanner.close();
    }
}
