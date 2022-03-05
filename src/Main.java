import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //array where all the words are going to be
        String[] wordsArr = new String[500];

        // getting and reading txt file
        File wordsFile = new File("/Users/tinaz/Desktop/Dev/java/snowman/6-LetterWords.txt");
        Scanner readWords = new Scanner(wordsFile);

        //putting it in an array
        for (int i = 0; i < 500; i++)
        {
            wordsArr[i] = readWords.nextLine();
            System.out.println(wordsArr[i]);
        }

        //picking random word;
        Random rand = new Random();
        int randomNum = rand.nextInt(500);

        String answerWord = wordsArr[randomNum];

        //inst word.java
        Word word = new Word(answerWord);
    }

    public void game() {
        //guessed letters (26, because 26 letters)
        char[] lettersGuessed = new char[26];

        //checks if the letter has already been guessed

    }
}
