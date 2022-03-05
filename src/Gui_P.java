import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Gui_P extends JPanel implements KeyListener{
    //declare the variables you want to use here
    String answer;
    char userGuess;

    // default constructor
    // the constructor should also initialize any of the variables you declared above
    public Gui_P() {
        //set the variables to their starting values here
        answer = "baby shark";
        userGuess = ' ';


        //these lines are settings for the panel
        setPreferredSize(new Dimension(1280,720));
        this.setFocusable(true);

        //this registers GraphicsPanel as the component that is listening to the key events, don't remove it
        this.addKeyListener(this);
    }


    //add your draw methods here
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.RED);

        g2.drawRect(100, 100, 100, 100);

        g2.setFont(new Font("Arial", 1, 50));
        g2.drawString( answer , 50,50);

    }


    @Override
    // triggers when a key is typed
    // method: keyTyped()
    // description: This method is called when a key is pressed and released. It basically combines the keyPressed and
    //              keyReleased functions.  You can determine which key is typed using the KeyEvent object
    public void keyTyped(KeyEvent e) {
        //gets character data and stores in char c
        char c = e.getKeyChar();
        System.out.println("The key you pressed was " + c );
        //this could be a way to store the user's letter guess from the key typed
        userGuess = c;
    }

    @Override
    // triggers once when a key is pressed, it retriggers when it is released then repressed
    // method: keyPressed()
    // description: This method is called when a key is pressed. You can determine which key is pressed using the
    //		KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
    //		the left key was pressed.
    // parameters: KeyEvent e
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            System.out.println("You pressed the right arrow");
        this.repaint();


    }

    @Override
    // triggers once when a key is released
    // method: keyReleased()
    // description: This method is called when a key is released. You can determine which key is released using the
    //		KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
    //		the left key was released.
    // parameters: KeyEvent e

    public void keyReleased(KeyEvent e) {

    }

}