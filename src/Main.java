import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //instantiating object(s)
    Output_Panel gui = new Output_Panel();
    Output_Main guiMain = new Output_Main();

    //instances
    private static String answerWord;

    public static void main(String[] args) throws Exception {
        //array where all the words are going to be
        String[] wordsArr = new String[500];

        // getting and reading txt file
        File wordsFile = new File("/Users/tinaz/Documents/GitHub/SnowmanGameRedo/6-LetterWords.txt");
        Scanner readWords = new Scanner(wordsFile);

        //putting it in an array
        for (int i = 0; i < 500; i++)
        {
            wordsArr[i] = readWords.nextLine();
        }

        //picking random word;
        Random rand = new Random();
        int randomNum = rand.nextInt(500);

        answerWord = wordsArr[randomNum];

    }

    public void game() {
    }

    public char letterGuessed() {
        //guessed letters (26, because 26 letters)
        char letterGuessed = gui.returnUserInput();
        char[] lettersGuessed = new char[26];
        boolean alreadyGuessed = false;

        //checks if the letter has already been guessed
        for (int i = 0; i < lettersGuessed.length; i++) {
            if (lettersGuessed.equals(lettersGuessed[i])) {
                i = lettersGuessed.length;
                System.out.println("already chosen");
                alreadyGuessed = true;
            }
        }

        if (alreadyGuessed ==  false) {
            for (int i = 0; i < lettersGuessed.length; i++) {
                if (lettersGuessed[i] == 0) {
                    lettersGuessed[i] = letterGuessed;
                    return letterGuessed;
                }
            }
        }
        return 0;
    }


}
