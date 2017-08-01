package models;

/**
 * Created by Guest on 8/1/17.
 */
public class Anagram {
    public String checkAnagram (String words) {
        String result = "";
        String[] wordArray;
        wordArray = words.split(" ");
        if (wordArray.length != 2) {
            result = "false";
        }
        return result;
    }
}
