public class NestedLoops {

    public static String xSquare(int n) {
        String square = "";
        for (int row = 1; row <= n; row++)
        {
            for (int col = 1; col <= n; col++)
            {
                square+= "X";
            }
            square += "\n";
    }
        return square;
    }

    public static String flippedTriangle(int n) {
        String triangle = "";
        for (int row = n; row >= 1; row--)
        {
            for (int col = 1; col <= row; col++)
            {
                triangle+= "*";
            }
            triangle += "\n";
        }
        return triangle;
    }


    public static String fizzBuzz(int n) {
        String fizz = "";
        for (int row = 1; row<=n; row++)
        {
            if (row%20 == 1 && row !=1) {
                fizz+= "\n";
                if (row % 3 == 0 && row % 5 == 0) {
                    fizz += "FizzBuzz ";
                }
                else if (row%5 ==0) {
                    fizz+= "Buzz ";
                }
                else if (row%3 == 0) {
                    fizz += "Fizz ";
                }
                else {
                    fizz += row + " ";
                }
            }
            else {
                if (row % 3 == 0 && row % 5 == 0) {
                    fizz += "FizzBuzz ";
                }
                else if (row%5 ==0) {
                    fizz+= "Buzz ";
                }
                else if (row%3 == 0) {
                    fizz += "Fizz ";
                }
                else {
                    fizz += row + " ";
                }
            }
        }
        return fizz;

    }
}
