package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println(circleArea(5));
        System.out.println(circleArea(9));

        System.out.println(Main.circleCircum(5));;
        System.out.println(Main.circleCircum(9));;

        System.out.println(Main.circleInfo(5));
        System.out.println(Main.circleInfo(9));

        System.out.println(Main.minutesToHoursMinutes(267));
        System.out.println(Main.minutesToHoursMinutes(512));

        System.out.println(Main.twentyFourToTwelve("13:43"));
        System.out.println( Main.twentyFourToTwelve("14:15"));

        System.out.println(Main.distanceBetweenTwoPoints(3,4,1,7));
        System.out.println(Main.distanceBetweenTwoPoints(7,9,1,1));

        System.out.println(Main.fahrenheitToCelsius(100));
        System.out.println(Main.fahrenheitToCelsius(78));

        System.out.println(Main.celsiusToFahrenheit(35));
        System.out.println(Main.celsiusToFahrenheit(12));
    }
    /** Method 1
     * Method name: circleArea
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleArea(int)
     * Returns the area of a circle. */
    public static double circleArea(int radius) {
        return (double) Math.round(Math.PI * radius * radius*100)/100;
    }

    /** Method 2
     * Method name: circleCircum
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleCircum(int)
     * Returns the circumference of a circle. */
    public static double circleCircum(int radius) {
        return (double) Math.round(Math.PI * radius * 2*100)/100;
    }

    /** Method 3
     * Method name: circleInfo
     * Method return type: String
     * Method parameter: the radius of a circle
     * Method signature: circleInfo(int)
     * Returns a String detailing the radius, circumference, and area of a circle.
     * Format of returned String: e.g.
     * Radius: 3
     * Circumference: 18.85
     * Area: 28.27 */
    public static String circleInfo(int radius) {
        return  "Radius: " + radius + "\nCircumference:" + circleCircum(radius) + "\nArea: " +circleArea(radius);
    }

    /** Method 4
     * Method name: minutesToHoursMinutes
     * Method return type: String
     * Method parameter: total minutes (e.g. 226)
     * Method signature: minutesToHoursMinutes(int)
     * Returns a String detailing the number of hours and minutes.
     * Format of returned String: e.g. 3 hours and 46 minutes */
    public static String minutesToHoursMinutes(int minutes) {
        return minutes/60 + " hours and " + minutes%60 + " minutes.";
    }

    /** Method 5
     * Method name: twentyFourToTwelve
     * Method return type: String
     * Method parameter: time in 24-hour format (e.g. 15:56). time >= 13:00 (always pm)
     * Method signature: twentyFourToTwelve(String)
     * Returns a String detailing the time in 12-hour format (e.g. 3:56 pm).
     * Format of returned String: e.g. 3:56 pm
     * */
    public static String twentyFourToTwelve(String time) {

        int hourInt = Integer.parseInt(time.substring(0,2))-12;
        String hourString = "" + hourInt;
        int minuteInt = Integer.parseInt(time.substring(3,5));
        String minuteString = "" + minuteInt;
        return hourString + ":" + minuteString + " pm";

    }

    /** Method 6
     * Method name: distanceBetweenTwoPoints
     * Method return type: double
     * Method parameter: x1, y1, x2, y2 (the two coordinates on a 2D plane)
     * Method signature: distanceBetweenTwoPoints(int,int,int,int)
     * Returns the distance between two points */
    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        return (double) Math.round(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2))*100)/100;
    }

    /** Method 7
     * Method name: fahrenheitToCelsius
     * Method return type: double
     * Method parameter: degrees fahrenheit
     * Method signature: fahrenheitToCelsius(int)
     * Returns the degrees celsius equivalent of the degrees in fahrenheit */
    public static double fahrenheitToCelsius(int fahrenheit) {
        return (double) Math.round((fahrenheit-32.0)*5/9*100)/100;

    }

    /** Method 8
     * Method name: celsiusToFahrenheit
     * Method return type: double
     * Method parameter: degrees celsius
     * Method signature: celsiusToFahrenheit(int)
     * Returns the degrees fahrenheit equivalent of the degrees in celsius */
    public static double celsiusToFahrenheit(int celsius) {
        return(double) Math.round(((celsius*9.0/5.0)+32.0)*100)/100;
    }

}