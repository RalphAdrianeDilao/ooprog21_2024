package BloodDataChallenge;

import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BloodData patient = new BloodData();

        boolean validBloodType = false;
        boolean validRhFactor = false;

        while (!validBloodType) {
            System.out.print("Enter Blood Type: ");
            String bloodType = scan.nextLine();
            validBloodType = patient.setBlood(bloodType);
        }

        while (!validRhFactor) {
            System.out.print("Enter Rh Factor: ");
            String rhFactor = scan.nextLine();
            validRhFactor = patient.setRH(rhFactor);
        }

        patient.displayBloodInfo();
    }
}
