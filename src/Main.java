import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
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

}
