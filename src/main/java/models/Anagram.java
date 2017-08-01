package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Guest on 8/1/17.
 */
public class Anagram {
    public String checkAnagram (String words) {
        String result = "";
        words.toLowerCase();
        String[] wordArray;
        wordArray = words.split(" ");
        List<String> wordString = new ArrayList<String>(Arrays.asList(wordArray));
        if (wordArray.length != 2) {
            result = "false";
        } else if (wordArray.length == 2) {
            String word1 = wordString.get(0);
            String word2 = wordString.get(1);
            char[] word1Array = word1.toCharArray();
            char[] word2Array = word2.toCharArray();
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            if (Arrays.equals(word1Array, word2Array)) {
                result = "true";
            } else {
                result = "false";
            }
        }
        return result;
    }
}
