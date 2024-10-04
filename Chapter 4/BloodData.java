public class BloodData {
    private String bloodType;
    private String rhFactor;

    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    public String getBlood() {
        return bloodType;
    }

    public boolean setBlood(String bloodType) {
        if (bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O")) {
            this.bloodType = bloodType;
            return true;
        } else {
            System.out.println("Invalid blood type. Please enter A, B, AB, or O.");
            return false;
        }
    }

    public String getRH() {
        return rhFactor;
    }

    public boolean setRH(String rhFactor) {
        if (rhFactor.equals("+") || rhFactor.equals("-")) {
            this.rhFactor = rhFactor;
            return true;
        } else {
            System.out.println("Invalid Rh factor. Please enter + or -.");
            return false;
        }
    }

    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }
}
