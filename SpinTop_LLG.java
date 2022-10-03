public class Lauraplayground_week_4_Assignment_1 {
    public static final int Size = 4;

    // remember first for loop affects number of rows
// and the first nested for loop affects what happens in the columns
    public static void main(String[] args) {
        topstick(); // done
        topspin(); // done :D
        midspin();//done
        botspin(); // done :D
        botstick();//done
        flatbot(); // done
    }

    public static void topstick() {
        //top stick//
        for (int row = 1; row <= 2 + (Size - 1); row++) {
            //2 + (input minus 1)
            for (int column = 0; column < Size - 1; column++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void topspin() {
        for (int row = 1; row < Size; row++) {
            //each part will print on the same line
            for (int column = 1; column < Size - row; column++) {
                System.out.print(" ");
            }
            for (int leftspin = 0; leftspin < row; leftspin++) {
                System.out.print("*");
            }
            System.out.print("||");
            for (int rightspin = 0; rightspin < row; rightspin++) {
                System.out.print("*");
            }
            System.out.println();
            //enter to the next line for the next part
        }
    }

    // middle line of spinner
    public static void midspin() {
        for (int row = 0; row <= 2 * Size - 1; row++) {
            System.out.print("=");
        }
        System.out.println();
        // 2*input of size
        //   = System.out.print("=")
    }

    // bottom half of spinner
    public static void botspin() {
        for (int row = 0; row < Size; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print(" ");
            }
            for (int leftspin = 0; leftspin < Size - 1 - row; leftspin++) {
                System.out.print("*");
            }
            System.out.print("||");
            for (int rightspin = 0; rightspin < Size - 1 - row; rightspin++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void botstick() {
        for (int row = 1; row <= (2 * Size + 1); row++) {
            //2 + (input minus 1)
            for (int column = 0; column < Size - 1; column++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void flatbot() {
        // flat bottom
        for (int row = 0; row <= Size - 1; row++) {
            midspin();
        }
    }
}
