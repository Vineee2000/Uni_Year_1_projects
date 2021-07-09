import javax.swing.*;
import java.awt.*;

public class BelishaBeacon extends JComponent {
    public static void main (String [] args) {
        JFrame window = new JFrame("Belisha Beacon");
        window.setSize(600, 600);
        window.add(new BelishaBeacon());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    public void paintComponent(Graphics graphics) {
        Graphics2D circle = (Graphics2D) graphics;
        circle.setColor(Color.green);
        circle.fillOval(200, 200, 100, 100);
    }
}