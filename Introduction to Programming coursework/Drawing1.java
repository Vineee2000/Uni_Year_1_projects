import java.awt.*;
import javax.swing.*;

public class Drawing1 extends JComponent {
    public static void main(String[] a) {
        JFrame window = new JFrame("Belisha Beacon");
        window.setSize(600, 600);
        window.add(new Drawing1());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    public void paintComponent(Graphics graphics) {
        Graphics2D circle = (Graphics2D) graphics;
// add drawing code below
        circle.setColor(Color.green);
        circle.fillOval(100, 100, 300, 300);
    } }