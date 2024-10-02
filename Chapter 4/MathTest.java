public class MathTest {
    public static void main(String[] args) {
        double sqrtValue = Math.sqrt(37);
        System.out.println("SQRT: " + sqrtValue);

        double sinValue = Math.sin(3 * Math.PI / 2);
        double cosValue = Math.cos(3 * Math.PI / 2);
        System.out.println("SIN: " + sinValue);
        System.out.println("COS: " + cosValue);

        double num = 22.75;
        double floorValue = Math.floor(num);
        double ceilValue = Math.ceil(num);
        System.out.println("FLOOR: " + floorValue);
        System.out.println("CEIL: " + ceilValue);

        long roundValue = Math.round(num);
        System.out.println("ROUND: " + roundValue);

        int maxValue = Math.max(71, 68);
        int minValue = Math.min(71, 68);
        System.out.println("MAX: " + maxValue);
        System.out.println("MIN: " + minValue);

        double randomValue = Math.random() * 100;
        System.out.println("RANDOM: " + randomValue);
    }
}
