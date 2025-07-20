// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

package Java.Strings.Easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println("\n\nLength of the last word in the sentence : " + LengthOfLastWord(str));
    }

    public static int LengthOfLastWord(String s){
        String str = s.trim();
        int count = 0;

        for(int i=str.length()-1;i>=0;i--){
            if (str.charAt(i) != ' ') {
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
