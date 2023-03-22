public class Main {
    public static void main(String[] args) {

    calcFeetAndInchesToCentimeters(5,10);
    calcFeetAndInchesToCentimeters(14);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet >= 0){
            feet = feet * 12 * 2.54;
        }
        else return -1;

        if(inches >= 0 && inches <= 12){
            inches = inches * 2.54;
        }
        else return -1;

        System.out.println("It is: " + (feet + inches) + "cm.");

        return feet + inches;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches >= 0){
            inches = inches/12;
        }
        else return -1;

        System.out.println("It is: " + inches + "feet.");

        return inches;
    }

}
