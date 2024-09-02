import java.util.Scanner;

public class SammysRentalPrice {

    public static final float RATE_PER_HOUR = 40.0f;
    public static final float RATE_PER_ADD_MIN = 1.0f;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter mins. of use: ");
        int totMinsOfUse = scan.nextInt();

        int hoursUsed = totMinsOfUse / 60;
        int extraMinsUsed = totMinsOfUse % 60;
        float rentalCost = calcRentalCost(hoursUsed, extraMinsUsed);

        displaySammysMotto();
        displayRentalDetails(hoursUsed, extraMinsUsed, rentalCost);

        return;
    }

    public static float calcRentalCost(int hoursUsed, int extraMinsUsed) {
        return (hoursUsed * RATE_PER_HOUR) + (extraMinsUsed * RATE_PER_ADD_MIN);
    }

    public static void displaySammysMotto() {
        System.out.println();
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S   Sammy's makes it fun in the sun.   S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println();

        return;
    }

    public static void displayRentalDetails(int hoursUsed, int extraMinsUsed, float rentalCost) {
        System.out.println("You have rented the equipment for...");
        System.out.println("Hours: " + hoursUsed);
        System.out.println("Minutes: " + extraMinsUsed);

        System.out.println();
        System.out.println("Total Price: $" + rentalCost);

        return;
    }
}
