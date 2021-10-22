import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
    static  JTextField textInputField;

    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Calculator");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("Enter a number: ");
        JLabel inputLabel2 = new JLabel("Enter a number: ");
        inputLabel1 = new JTextField(10);
        inputLabel2 = new JTextField(10);

        JButton addBut = new JButton("Add");
        JButton subtractionBut = new JButton("Subtraction");
        JButton multBut = new JButton("Multiply");
        JButton divBut = new JButton("Divide");

        resultLable = new JLabel("0.00");



        window.setSize(300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);



        panel.add(inputLabel1);
        panel.add(textInputField);
        panel.add(inputLabel2);
        panel.add(textInputField);

        panel.add(addBut);
        panel.add(subtractionBut);



    }











}
