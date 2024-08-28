public class warmup_sleepin {
    public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
        if (!isWeekday || isVacation) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }
}
