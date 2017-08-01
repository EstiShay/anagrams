package models;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class AnagramTest {

    @Test
    public void checkAnagram_returnFalseForMissingEntry_False() throws Exception {
        Anagram testAnagram = new Anagram();
        String expected = "false";
        assertEquals(expected, testAnagram.checkAnagram("dog"));
    }

//    @Test
//    public void checkAnagram_returnFalseForTwoNotAnagrams_False() throws Exception {
//        Anagram testAnagram = new Anagram();
//        String expected = "false";
//        assertEquals(expected, testAnagram.checkAnagram("dog cat"));
    }
}