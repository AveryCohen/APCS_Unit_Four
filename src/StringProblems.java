import java.util.Locale;

public class StringProblems {

    public static String addHyphens(String s) {
        String newString = "";
        for(int i=0; i<s.length(); i++) {
            newString += s.substring(i, i+1) + "-";
        }

        return newString.substring(0, newString.length()-1);
    }

    public static String everyOtherLetter(String s) {
        String newString = "";
        for(int i=0; i<s.length(); i+=2) {
            newString += s.substring(i, i+1);
        }

        return newString;
    }


    public static String differentStrings(String s1, String s2) {

        return "";
    }

    public static boolean isPalindrome(String word) {
        String wordReversed = "";
        String ithLetter, jthLetter;
        String wordlow = word.toLowerCase();
        String wordlownospace = "";
        for(int i=0; i < wordlow.length(); i++) {
            jthLetter = wordlow.substring(i,i+1);
            if (!wordlow.substring(i, i+1).equals(" ")) {
                wordlownospace += jthLetter;
            }
        }
        for(int i=0; i < wordlownospace.length(); i++) {
            ithLetter = wordlownospace.substring(i,i+1);

            wordReversed = ithLetter + wordReversed;
        }
        if (wordReversed.toLowerCase().equals(wordlownospace)) {
            return true;
        }
        else {
            return false;
        }
    }
}
