import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    JFrame frame;

    public ArtworkGUI() {

        frame = new JFrame("Simple Drawing");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel {

        public MyDrawing(){
            //Set the background color
            setBackground(Color.white);

        }

        public void paintComponent(Graphics g){
        //Add the PaintComponent Method and create your drawing.

            super.paintComponent(g);

            g.setColor(Color.BLACK);
            g.fillRect(100,100,250,250);

            g.setColor(Color.white);
            g.drawRect(130,150,50,50);
            g.fillRect(144,165,20,20);
            g.setColor(Color.MAGENTA);
            g.fillRect(150,167,10,10);
            g.setColor(Color.white);
            g.drawRect(265,150,50,50);
            g.fillRect(278,165,20,20);
            g.setColor(Color.MAGENTA);
            g.fillRect(284,167,10,10);
            g.setColor(Color.WHITE);
            g.fillOval(170,250,100,60);
            g.setColor(Color.RED);
            g.drawOval(170,250,100,60);



        }
    }
}