import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {

    static int clickerCount = 0;
    static JLabel clickerCounterLabel;

    static  JTextField textInputField;

    public static void main(String[] args) {

        JFrame window = new JFrame("CLICKER GAME");
        JPanel panel = new JPanel();
        textInputField = new JTextField(10);
        clickerCounterLabel = new JLabel("Balance : $");
        JLabel textInputLabel = new JLabel("Enter a product name: ");
        JButton clicker = new JButton("click for 1$");

        window.setSize(150, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(textInputLabel);
        panel.add(textInputField);
        panel.add(clickerCounterLabel);
        panel.add(clicker);
        window.add(panel);

        window.setVisible(true);

    }
    private static class ButtonListener1 implements ActionListener{


        public void actionPerformed(ActionEvent actionEvent) {

            int multiplier =Integer.parseInt(textInputField.getText());

            clickerCount += multiplier;
            clickerCounterLabel.setText("Balance:  $" + clickerCount);

        }
    }



}
