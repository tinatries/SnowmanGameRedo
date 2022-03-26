import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Word {

//  stores all the words available
    String[] wordList = new String[500];

//  calling objects
    Random rand = new Random();

//  instance variables
    private String answer;
    private char[] answerSpelt = new char[6];

    public Word()
    {
//      checks if words need storing
        if (wordList[0] == null)
        {
            this.storeWords();
        }

//        random word
        this.randWord();

    }

//  stores all words in wordList array
    private void storeWords()
    {
        try {
            File file = new File("6-LetterWords.txt");
            Scanner scanner = new Scanner(file);
            for (int i = 0; i < 500; i++) {
                wordList[i] = scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }

//    chooses the random word && puts them in individual letters
    private void randWord()
    {
        answer = wordList[rand.nextInt(500)];
        answerSpelt= answer.toCharArray();
        for(int i = 0; i < answerSpelt.length; i++)
            System.out.println(answerSpelt[i]);
    }
}
