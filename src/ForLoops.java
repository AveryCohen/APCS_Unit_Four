import java.util.Scanner;

import java.util.Scanner;

public class ForLoops {
    Scanner scan = new Scanner(System.in);

    /**
     * Sample usage:
     * printingHashTags(0) returns ""
     * printingHashTags(4) returns "####"
     * @param num Integer representing the number of hashtags to draw
     * @return A string of hashtags
     */
    public static String printingHashTags(int num) {
        String tags = "";
        for(int num1 = 0; num1 < num; num1++) {
            tags += "#";
        }

        return tags; // update or remove this line. It is only there so the tests do not show an error.
    }

    /**
     * Sample usage:
     * countDown(0, 10) -> “10 9 8 7 6 5 4 3 2 1 0 ”
     * countDown(10, 0) -> “10 9 8 7 6 5 4 3 2 1 0 “
     * @param num1 an integer
     * @param num2 an integer
     * @return a countdown from the largest parameter to the smallest.
     */
    public static String countDown(int num1, int num2) {
        String count = "";
        if (num2 > num1) {
            for (int from = num2; from >= num1; from--) {
                count += from + " ";
            }
        }
        else if (num1 > num2) {
                for (int from2 = num1; from2 >= num2; from2--) {
                    count += from2 + " ";
                }
        }

        return count; // update or remove this line. It is only there so the tests do not show an error.
    }


}
