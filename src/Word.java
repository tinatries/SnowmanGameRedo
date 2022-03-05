public class Word {
    char[] word;

    public Word(String answerWord) {
        //makes it individual letters in each index
        word = answerWord.toCharArray();
    }

    public boolean letterGuess(char guess)
    {
        //checks if the letter guessed is in the word
        boolean inWord = false;
        for(int i = 0; i < word.length; i++)
        {
            if (word[i] == guess)
            {
                inWord = true;
                i = word.length;
            }
        }
        return inWord;
    }

    public char[] getWord() {
        return word;
    }
}
