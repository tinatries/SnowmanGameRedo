import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main extends JFrame{
    private static String answer = "";

    public static void main(String[] args) {
        //sets up the word
        Word word = new Word(getWord());
        //graphics
        gui();

    }

    public static String getWord() {
        String[] wordList = new String[500];
        int counter = 0;

        try {
            File file = new File("/Users/tinaz/Documents/GitHub/SnowmanGameRedo/6-LetterWords.txt");
            Scanner scanner = new Scanner(file);
            for (int i = 0; i < 500; i++)
            {
                wordList[i] = scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        Random rand = new Random();
        answer = wordList[rand.nextInt(500)];
        return answer;
    }

    //Replaced the Main Graphic Thing...couldn't get it to open by calling the main so-
    //this thing is confusing...need to research a better way to do graphics
    public static void gui() {
        Main window = new Main();
        JPanel p = new JPanel();
        p.add(new Gui_P());  //  add a class that extends JPanel
        window.setTitle("Snowman");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setContentPane(p);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}
