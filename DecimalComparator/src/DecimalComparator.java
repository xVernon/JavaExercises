public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        int checkA = (int) (a * 1000);
        int checkB = (int) (b * 1000);

        if(checkA == checkB) return true;

        return false;
    }

}
