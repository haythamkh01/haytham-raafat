import javax.swing.*;
import java.awt.*;

public class MainScene extends JFrame {
        

    public static final int WIDTH =800;
    public static final int HEIGHT =600;



    public Window(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(WIDTH,HEIGHT);
        this.setResizable(false);
        this.setLayout(null);


        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
