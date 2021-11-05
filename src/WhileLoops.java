import java.util.Scanner;

public class WhileLoops {
    Scanner scan = new Scanner(System.in);

    /**
     * Usage examples:
     * fromHereToThere(20, 30) -> “20 21 22 23 24 25 26 27 28 29 30”
     * fromHereToThere(30, 20) -> “Invalid input”
     * @param num1 - The starting number
     * @param num2 - The ending number
     * @return A string consisting of either the range of numbers or Invalid Input
     */
    public static String fromHereToThere(int num1, int num2) {

        String numbs = "";
if (!(num1 == 0 || num2 == 0)) {
    if (num1 < num2) {
        int nums = num1;
        while (nums <= num2) {
            numbs += nums + " ";
            nums ++;
        }
        return numbs;
    }
    else {
        System.out.println("invalid input");
    }
}
else {
    System.out.println("invalid input");
}
return "";
    }

    /**
     * Use a while loop to allow the user to enter positive or negative integers. The loop will exit
     * when the user enters a 0.
     * @return - A string showing how many positive and negative numbers were entered by the user.
     */
    public static String countPosAndNeg() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive or negative number or 0 to quit: ");
        int num1 = scan.nextInt();
        int countpos = 0;
        int countneg = 0;
        while (num1 != 0) {
            if (num1 < 0) {
                countneg++;
            }
            else if (num1 > 0) {
                countpos++;
            }
            System.out.print("Enter a positive or negative number or 0 to quit: ");
            num1 = scan.nextInt();
        }
        String finCount = "There were " + countpos + " positive and " + countneg + " negative numbers";
        return finCount;
    }

    /**
     * Allow the user to enter 5 whole numbers (can be positive or negative). Keep track
     * of the largest and the smallest.
     * @return A string giving the minimum and maximum. Ex. "The Max value is: 45\nThe Min value is: -87"
     */
    public static String findMinAndMax() {

       return ""; // update or remove this line. It is only there so the tests do not show an error.
    }

    /**
     * Calculates all the factors of the given number.
     * @param num A int value greater than 0
     * @return A string of all the factors of the given number separated by a space.
     * Ex. factors(12) returns "The factors of 12 are: 1 2 3 4 6 12 "
     */
    public static String factors(int num) {

        return ""; // update or remove this line. It is only there so the tests do not show an error.
    }


}
