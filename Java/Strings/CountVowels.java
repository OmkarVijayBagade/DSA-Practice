// Count Vowels and Consonants
// Problem Statement

// Given a string, count the number of vowels and consonants in it. 
// Ignore spaces and case sensitivity.

// Example:
// Input: "hello" → Output: Vowels = 2, Consonants = 3


package Java.Strings;

public class CountVowels {

    public static void main(String[] args) {
        String s = "hello world";
        int[] result = countVowelsConsonants((s));
        System.out.println("Vowels: " + result[0] + ", Consonants: " + result[1]);
    }

    public static int[] countVowelsConsonants(String s){
        int vowels = 0, consonants = 0;
        s = s.toLowerCase();

        for (char c : s.toCharArray()){
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }       
         return new int[]{vowels, consonants};
    }
}
