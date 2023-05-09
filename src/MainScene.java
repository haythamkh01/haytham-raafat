    import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

    public class CarPainting extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // set background color to white
            setBackground(Color.BLUE);

            // paint the body of the car
            g.setColor(Color.RED);
            g.fillRect(100, 100, 200, 50);

            g.fillRect(110, 60, 150, 40);

            // paint the wheels of the car
            g.setColor(Color.BLACK);
            g.fillOval(100, 140, 50, 50);
            g.fillOval(250, 140, 50, 50);
        }

        public static void main(String[] args) {
            // create a JFrame and set its properties
            JFrame frame = new JFrame("Car Painting");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            // create an instance of the CarPainting JPanel
            CarPainting carPainting = new CarPainting();

            // add the JPanel to the JFrame and make it visible
            frame.add(carPainting);
            frame.setVisible(true);
        }
    }


