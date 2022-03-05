public class Word {
    //objects
    Output_Panel gui = new Output_Panel();

    //instances
    private char[] alreadyLetters = new char[26];
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

    public boolean letterGuessed()
    {
        //guessed letters (26, because 26 letters)
        char letterGuessed = gui.returnUserInput();
        boolean alreadyGuessed = false;

        //checks if the letter has already been guessed
        for (int i = 0; i < alreadyLetters.length; i++)
        {
            if (letterGuessed == (alreadyLetters[i]))
            {
                i = alreadyLetters.length;
                System.out.println("already chosen");
                alreadyGuessed = true;

            }
        }

        if (alreadyGuessed ==  false) {
            for (int i = 0; i < alreadyLetters.length; i++)
            {
                if (alreadyLetters[i] == 0)
                {
                    alreadyLetters[i] = letterGuessed;
                }
            }
        }
        return alreadyGuessed;
    }
}
