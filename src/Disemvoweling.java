import java.util.Scanner;
public class Disemvoweling {

    public static String disemdouble(String userInput) {
        String s = "";

            for (int i = 0; i < userInput.length() - 1; i += 1) {
                String a = userInput.substring(i, i + 1);
                String b = userInput.substring(i + 1, i + 2);
                if (a.equals(b)) {
                    s += userInput.substring(i, i + 1);
                    i += 1;
                } else {
                    s += userInput.substring(i, i + 1);
                }
            }
            if (!(userInput.substring(userInput.length()-2, userInput.length()-1).equals(userInput.substring(userInput.length()-1, userInput.length())))) {
                s += userInput.substring(userInput.length() - 1);
            }

        return s;
    }
    public static String disemvowel(String s) {
        String newString = "";
        for(int i=0; i<s.length(); i+=1) {
            if (s.substring(i, i+1).equals("a") || s.substring(i, i+1).equals("e") || s.substring(i, i+1).equals("i") || s.substring(i, i+1).equals("o") || s.substring(i, i+1).equals("u")) {
               newString += "";
            }
            else {
                newString += s.substring(i, i+1);
            }
        }

        return newString;
    }
    public static double reductionRate(int initial, int fin) {
        double reductionV1 = (1- ((double)fin)/((double)initial))*1000;
        double reductionV2 = (int)reductionV1;
        double reductionFinal = reductionV2/10;
        return  reductionFinal;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the disemvoweling utility.");
        System.out.print("Enter your phrase: ");
        String userInput = scan.nextLine();
        int initial = userInput.length();
        String s = disemvowel(userInput);
        String newString = disemdouble(s);
        String newNewString = disemdouble(newString);
        int fin = newNewString.length();
        double rate = reductionRate(initial, fin);
        System.out.println("The disemvoweled phrase is: " + newNewString);
        System.out.println("Reduced from " + initial + " to " + fin + " characters.  Reduction rate of " + rate + "%");
    }
}
