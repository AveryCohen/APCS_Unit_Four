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
    public static String sideways() {
        int n =5;
        int m = n/2;
        int o = 0;
        if (n%2 == 1) {
            o+= m+1;
        }
        String triangle = "";
        for (int p = 1; p >=5; p ++) {
            for (int roww = 1; roww > o; roww++) {
                for (int coll = 1; coll <= roww; coll++) {
                    triangle += "*";
                }
                triangle += "\n";
            }
            for (int row = m; row >= 1; row--) {
                for (int col = 1; col <= row; col++) {
                    triangle += "*";
                }
                triangle += "\n";
            }
        }
        return triangle;
    }
}

