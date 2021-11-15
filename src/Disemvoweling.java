import java.util.Scanner;
public class Disemvoweling {

    public static String disemdouble(String userInput) {
        String s = "";
        for(int i=0; i<userInput.length(); i+=1) {
            if (userInput.substring(i, i+1).equals(userInput.substring(i+1, i+2))) {
                s += userInput.substring(i, i+1);
                i++;
            }
            else {
                s += userInput.substring(i, i+1);
            }
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the disemvoweling utility.");
        System.out.print("Enter your phrase: ");
        String userInput = scan.nextLine();
        String s = disemdouble(userInput);
        String newString = disemvowel(s);
        System.out.println("The disemvoweled phrase is: " + newString);
    }
}
