import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public abstract class Output_Panel extends JPanel implements KeyListener {
    //constructor: makes the panel/gui and also adds the keylistener to that said panel
    public Output_Panel() {
        //these lines are settings for the panel
        setPreferredSize(new Dimension(1280,720));
        this.setFocusable(true);

        //this registers GraphicsPanel as the component that is listening to the key events
        this.addKeyListener(this);
    }

    //find character pressed using KeyListener and returns it
    char userinput;
    @Override
    public void keyTyped(KeyEvent e) {
        userinput = e.getKeyChar();
        returnUserInput();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            System.out.println("You pressed the right arrow");
        this.repaint();
    }

    //Just in case;
    public char returnUserInput()
    {
        System.out.println("The key you pressed was " + userinput );
        return userinput;
    }

}
