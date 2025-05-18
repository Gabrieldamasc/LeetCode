package Problems;

public class MergeStringsAlternately {
    public String MergeAlternately(String word1, String word2) {
        int m = word1.length();
        int p = word2.length();

        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < m || j < p) {
            if (i < m) {
                result.append(word1.charAt(i++));
            }
            if (j < p){
                result.append(word2.charAt(j++));
            }
        }
        return result.toString();
    }
}
