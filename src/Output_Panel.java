import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public class Output_Panel extends JPanel implements KeyListener {
    //instance variables
    private char userinput;
    private boolean isLetter = false;

    //constructor: makes the panel/gui and also adds the keylistener to that said panel
    public Output_Panel() {
        //these lines are settings for the panel
        setPreferredSize(new Dimension(1280,720));
        this.setFocusable(true);

        //this registers GraphicsPanel as the component that is listening to the key events
        this.addKeyListener(this);
    }

    //find character pressed using KeyListener and returns it
    @Override
    public void keyTyped(KeyEvent e) {
        userinput = e.getKeyChar();
        returnUserInput();
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        for (int i = 'A'; i <= 'Z'; i++)
        {
            if(e.getKeyCode() == i)
            {
                isLetter = true;
            }
        }

        if (isLetter == false) {
            System.out.println(" It was not a letter, please enter a letter");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //this is there so that the class actually runs without being an abstract...
    }

    //graphics
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.ORANGE);

        g2.drawRect(100, 100, 100, 100);

        g2.setFont(new Font("Arial", 1, 50));

        g2.drawString( "cheese" , 50,50);
    }

    //Methods for Main (just in case);
    public char returnUserInput()
    {
        System.out.println("The key you pressed was " + userinput );
        return userinput;
    }

    public boolean isLetter()
    {
        return isLetter;
    }

}
