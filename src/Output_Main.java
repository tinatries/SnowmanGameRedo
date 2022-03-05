import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Output_Main extends JFrame {

    //sets up the area to draw
    public static void main(String[] args) {
        Output_Main window = new Output_Main();
        JPanel p = new JPanel();
        p.add(new Output_Panel());  //  add a class that extends JPanel
        window.setTitle("COME ON");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setContentPane(p);

        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}