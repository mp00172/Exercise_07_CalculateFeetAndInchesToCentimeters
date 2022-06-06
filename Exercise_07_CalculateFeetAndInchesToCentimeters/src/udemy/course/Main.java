package udemy.course;

// Create a method called calcFeetAndInchesToCentimeters.
// It needs to have 2 parameters.
// feet is the first parameter, inches is the 2nd parameter.
//
// You should validate that the first parameter feet is >= 0.
// You should validate that the second parameter inches is >= 0 and <= 12.
// Return -1 from the method if either of the above is not true.
//
// If the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this method
// and return that value.
//
// Create a 2nd method of the same name but with only one parameter 'inches'.
// Validate that it's >= 0.
// Return -1 if it is not true.
// If it's valid, then calculate how many feet are in the inches and then here is the tricky part.
// Call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly.
//
// HINTS: Use double for your number datatypes.
// 1 inch = 2.54cm, 1 foot = 12 inches.
// Calling another overloaded method just requires you to use the right amount of parameters.

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(2.56,1.12);
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(-5,1.12);
        calcFeetAndInchesToCentimeters(2.56,-15);
        calcFeetAndInchesToCentimeters(2);
        calcFeetAndInchesToCentimeters(2.3);
        calcFeetAndInchesToCentimeters(-3);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid parameter");
            return -1;
        } else {
            double centimeters = (inches * 2.54) + ((feet * 12) * 2.54);
            System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid parameter");
            return -1;
        } else {
            double feet = (int) inches / 12;
            double inchesRemaining = (int) inches % 12;
            System.out.println(inches + " inches = " + feet + " feet and " + inchesRemaining + " inches");
            return calcFeetAndInchesToCentimeters(feet, inchesRemaining);
        }
    }
}
