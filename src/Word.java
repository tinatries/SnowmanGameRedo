import java.util.ArrayList;

public class Word {
    private ArrayList charList = new ArrayList();

    public Word(String word)
    {
        for (int i = 0; i < word.length(); i++)
        {
            charList.add(word.substring(i, i++));
        }
    }


}
