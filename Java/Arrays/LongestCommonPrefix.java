package Java.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racer","car"};

        System.out.println("Longest Common Prefix (Example 1): " + longestCommonPrefix(strs1)); // fl
        System.out.println("Longest Common Prefix (Example 2): " + longestCommonPrefix(strs2)); // ""
    }

    static String longestCommonPrefix (String[] strs){
        if (strs == null || strs.length == 0) return "";
        
        String prefix = strs[0];
        
        for(int i = 1; i < strs.length; i++ ){
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }

        }

        return prefix;
    }
}
