import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public class Output_Panel extends JPanel implements KeyListener {
    //constructor: makes the panel/gui and also adds the keylistener to that said panel
    public Output_Panel() {
        //these lines are settings for the panel
        setPreferredSize(new Dimension(1280,720));
        this.setFocusable(true);

        //this registers GraphicsPanel as the component that is listening to the key events
        this.addKeyListener(this);
    }

    char userinput;

    //find character pressed using KeyListener and returns it
    @Override
    public void keyTyped(KeyEvent e) {
        userinput = e.getKeyChar();
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        boolean isLetter = false;
        for (int i = 'a'; i <= 'z'; i++)
        {
            if(e.getKeyCode() == i)
            {
                isLetter = true;
            }
        }

        if (isLetter == false) {
            System.out.println("enter a letter");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //this is there so that the class actually runs without being an abstract...
    }

    //Methods for Main
    public char returnUserInput()
    {
        System.out.println("The key you pressed was " + userinput );
        return userinput;
    }

}
