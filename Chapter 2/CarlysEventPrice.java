import java.util.Scanner;

public class CarlysEventPrice {

    public static final float PRICE_PER_GUEST = 35.00f;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no. of guests: ");
        int noOfGuests = scan.nextInt();

        float totPrice = calcTotalPrice(noOfGuests);

        displayCompanyMotto();
        displayEventData(noOfGuests, totPrice);
        displayIsLargeEvent(noOfGuests);

        return;
    }

    public static float calcTotalPrice(float noOfGuests){
        return noOfGuests * PRICE_PER_GUEST;
    }

    public static void displayCompanyMotto(){
        System.out.println();
        System.out.println("*********************************************");
        System.out.println("*     Carly's makes the food that makes     *");
        System.out.println("*                it a party.                *");
        System.out.println("*********************************************");
        System.out.println();
        return;
    }

    public static void displayEventData(int noOfGuests, float totPrice){
        System.out.println("No. of Guests: " + noOfGuests);
        System.out.println("Price Per Guest: $" + PRICE_PER_GUEST);
        System.out.println("Total Price: $" + totPrice);
        System.out.println();
        
        return;
    }

    public static void displayIsLargeEvent(int noOfGuests){
        if(noOfGuests >= 50){
            System.out.println("Is the event considered a large event?");
            System.out.println(true);
        } else {
            System.out.println("Is the event considered a large event?");
            System.out.println(false);
        }

        return;
    }
}