import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    /*
        1. Get the input - radius
        2. Calculate are
        3. Calculate circumference
        4.Display results - outputs
     */


    public static void main(String[] args) {

        //create and run the program

        double radius = getInput("What is the radius?");

        double area = area(radius);

        double circumference = circumference(radius);

        JOptionPane.showMessageDialog(null, displayResults(area,circumference));
    }

    //Get the input
    public static double getInput(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double radius){

        return Math.pow(radius, 2) * Math.PI;

    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public  static double circumference(double radius){

        return 2 * Math.PI * radius;

    }

    public static String displayResults(double area,double circumference){

        DecimalFormat round = new DecimalFormat("#.00");

        String message = "The area is: " + round.format(area);
        message += "\nThe circumference is: " + round.format(circumference);

        return message;
    }

}
