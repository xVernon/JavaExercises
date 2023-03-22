public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c){

        if(isTeen(a) || isTeen(b) || isTeen(c)) return true;

        return false;
    }

    public static boolean isTeen(int a){

        if(13 <= a && 19 >= a) return true;

        return false;
    }
}
