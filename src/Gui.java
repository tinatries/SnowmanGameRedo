import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Gui extends JPanel{
    private JButton newGame, guessLetter;
    private JTextField guessBox;
    private JLabel guessBoxLabel;
    private ArrayList<JButton> alphabet = new ArrayList<JButton>();

//    objects
    Word word = new Word();

    public Gui()
    {
        //sets up panel
        JPanel panel = new JPanel();
        add(panel);
        panel.setPreferredSize(new Dimension(720, 750));
        panel.setBackground(new Color(155, 220, 200));

        JScrollBar sb = new JScrollBar();
        panel.add(sb);

        buttons(panel);
        userInput(panel);

        alphabetButtons(panel);
        panel.setLayout(null);

//        game;
    }

    public void buttons(JPanel panel)
    {
//        New Game Button
        newGame = new JButton("New Game");
        newGame.setBounds(70, 50, 110, 50);
        panel.add(newGame);

//        Guess Button
        guessLetter = new JButton("submit");
        guessLetter.setBounds(225, 450, 65, 50);
        panel.add(guessLetter);
    }

    public void userInput(JPanel panel)
    {
//        area for guessing letters (user enters letter/word)
        guessBoxLabel = new JLabel("guess:");
        guessBox = new JTextField("a letter");

//        ascetics
        guessBox.setBackground(null);

//        adding bounds and adding it to panel
        guessBoxLabel.setBounds(70, 450, 100, 50);
        guessBox.setBounds(125, 450, 100, 50);
        panel.add(guessBoxLabel);
        panel.add(guessBox);
    }

    public void alphabetButtons(JPanel panel)
    {
        String toString = "";
        int y = 520;
        int x = 25;
        int space = 40;
        for (char letter = 'a'; letter <= 'z'; letter++)
        {
            toString += letter;
            alphabet.add(new JButton(toString));
            toString = "";
        }
        for (int i = 0; i < 26; i++)
        {
            if (i != 0 && i % 10 ==0)
            {
                y += 65;
                x = 25;
                space = 40;
            }
            alphabet.get(i).setBounds(x + space, y, 50, 50);
            panel.add(alphabet.get(i));
            space += 60;
        }
    }
}
