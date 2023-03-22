public class Main {
    public static void main(String[] args) {

        String str1 = new String();
        String str2 = new String();

        str1 = getDurationString(118,20);
        str2 = getDurationString(7100);

        System.out.println(str1 + "\n" + str2);

    }

    public static String getDurationString(int minutes, int seconds){

        if((minutes <0) || (seconds <0) || (seconds >=60)){
            System.out.println("Minutes or seconds parameter are invalid.");
            return "Invalid value";
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

        System.out.println(hours + "h " + minutes + "m " + seconds + "s.");
        return hours + "h " + minutes + "m " + seconds + "s.";
    }

    public static String getDurationString(int seconds){

        if(seconds < 0){
            System.out.println("'Seconds' parameters is invalid.");
            return "Invalid value";
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds -= hours *3600 + minutes *60;


        System.out.println(hours + "h " + minutes + "m " + seconds + "s.");
        return hours + "h " + minutes + "m " + seconds + "s.";
    }
}
