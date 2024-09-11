import java.util.*;
import java.text.Collator;

public class StringManip {

    // Reverses the inputted string
    public String reverse(String str){

        // The string to be returned
        String revString = "";

        // Checks if the string is empty
        if(str.length() == 0){
            revString = str;
        }else{

            // Reverses the string by shuffling the characters
            for(int i=1; i<str.length()+1; i++){
                revString = revString + str.charAt(str.length()-i);
            }
        }

        return revString;
    }

    // Alphabetizes the words in an inputted string
    public String alphabetize(String str){

        // Turns the string into an array for easier sorting
        String[] newSentence = str.split(" ");

        // The string to be returned
        String finalSentence = "";

        // Sorts the array of the string, ignoring the case
        Arrays.sort(newSentence, Collator.getInstance());

        // Creates the final string by adding the array elements
        for(int i=0; i<newSentence.length; i++){
            finalSentence += newSentence[i] + " ";
        }

        return finalSentence;
    }

    // Returns the letter count of an inputted string
    public int letterCount(String str){

        int count = 0;

        // Counts the letters of a string by ignoring the spaces
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }

        return count;
    }

    // Returns the word count of an inputtedString
    public int wordCount(String str){

        // Checks for an empty string and returns 0 if string is empty
        if(str.length() == 0|| (str.length() == 1 && str.charAt(0) == ' ')){
            return 0;
        }

        // The word count to return
        int count = 1;

        // Goes through the string and counts the words based on the amount of spaces
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        return count;
    }

    // Returns the most common character in a string
    public char mostCommonChar(String str) {

        // Creates a hashmap to keep track of the individual characters in the string
        HashMap<Character, Integer> chars = new HashMap<>();

        // The letter count to keep track of
        int count = 0;

        // The most common character to return
        char mostcommon = ' ';

        // Checks for an empty string and returns 0 if string is empty
        if(str.length() == 0|| (str.length() == 1 && str.charAt(0) == ' ')){
            return 0;
        }

        // Goes through the string and counts how many of its characters occur using the hashmap
        for(int i=0; i<str.length(); i++){
            if(!chars.containsKey(str.charAt(i))&&str.charAt(i) != ' '){
                chars.put(str.charAt(i), 1);
            }else if(str.charAt(i) != ' '){
                chars.put(str.charAt(i), chars.get(str.charAt(i)) + 1);
            }
        }

        // Goes through the counts of the letters to see which occurs the most often
        for(HashMap.Entry<Character, Integer> i : chars.entrySet()){
            if(i.getValue() > count){
                count = i.getValue();
                mostcommon = i.getKey();
            }
        }

        return mostcommon;
    }

}
