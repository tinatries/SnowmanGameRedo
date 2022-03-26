import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main extends JFrame{

    public static void main(String[] args) {
//        frame
        JFrame frame = new JFrame("Snowman");
        frame.setSize(720, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        adding panel to frame
        frame.getContentPane().add(new Gui());


//        frame visibility
        frame.setVisible(true);
    }

}
