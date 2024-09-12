package in.codegrind.others.interviewexperiences.zoho24sep2024;

/*
    Question:
        Problem:
        You need to check if the pattern in str1 matches the words in str2.
        Each unique character in str1 should map to a unique word in str2.

        Example 1:
            input :
                str1 = "abba";
                str2 = "dog cat cat dog"

            Output:
                True


        Example 2:
            input :
                str1 = "aaabba";
                str2 = "dog cat cat dog"

            Output:
                False
 */

import java.util.HashMap;
import java.util.Map;

public class Q1PatternMatchingBetweenStrings {


    public static boolean wordPattern(String str1, String str2) {
        String[] words = str2.split(" ");
        if (str1.length() != words.length) return false;

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            String word = words[i];

            if (map1.containsKey(ch)) {
                if (!map1.get(ch).equals(word)) return false;
            } else {
                if (map2.containsKey(word)) return false;
                map1.put(ch, word);
                map2.put(word, ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));  // Output: true
        System.out.println(wordPattern("aaabba", "dog cat cat dog"));  // Output: false
    }

}
