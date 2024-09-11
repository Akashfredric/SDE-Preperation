package in.codegrind.dsa.patternproblems;

public class PatternProblemMainClass {
    public static void main(String[] args) {

        //rtTriangleAlphabetsPattern(5);
        //concentricNumSquarePattern(4);
        //concentricNumDiamondPattern(5);

        //pascalTrianglePattern(5);
        //hallowTrianglePattern(6);
        //rightTrianlgeNumPattern();
        //twoRightTriangleNumbered(5);
        //trianglePattern(7);
        //rotatedTrianglePatternRowbased(5);
        //rotatedTrianglePatternColbased(5);
    }


    public static void rtTriangleAlphabetsPattern(int num) {
        /*
           a
           B c
           D e F
           g H i J
           k L m N o
         */
        char letter= 'a';
        for(int row=1 ; row<=num ;  row++ ){
            for(int col=1 ; col<=row ; col++ ){
                System.out.print(letter+" ");
                letter++;
                if( Character.isLowerCase(letter)){
                    letter= Character.toUpperCase(letter);
                }
                else if( Character.isUpperCase(letter)){
                    letter= Character.toLowerCase(letter);
                }
            }
            System.out.println();
        }
    }


    public static void concentricNumSquarePattern(int num) {

         /*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
        */

        int totRow = 2*num-1 ;
        for(int row=0 ; row<totRow ; row++){
            for(int col=0 ; col<totRow ; col++ ){
                //System.out.print("["+row+","+col+"] ");
                int value = num - Math.min(Math.min(row, col), Math.min(totRow - row -1 , totRow - col -1));
                System.out.print(value+"  ");
            }
            System.out.println();
        }
    }



    public static void concentricNumDiamondPattern(int num) {
    /*
             1
            212
           32123
          4321234
           32123
            212
             1
     */
        for(int row=1 ; row<=(num*2)-1 ; row++){
            int totCol = 0;
            totCol =  row<=num ? row: (num*2)-row ;
            for(int col=1 ; col<=num-totCol ; col++ ){
                System.out.print( " ");

            }
            for(int col=totCol ; col>=1; col-- ){
                System.out.print( col );
            }
            for(int col=2 ; col <= totCol ; col++){
                System.out.print( col );
            }
            System.out.println();
        }
    }


    public static void concentricNumTrianglePattern(int num) {
        /*
                1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5

        */

        for (int row = 1; row <= num; row++) {
            for (int spaces = 1; spaces <= num - row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }


    public static void pascalTrianglePattern(int num) {
        /*
                      1
                    1   1
                  1   2   1
                1   3   3   1
              1   4   6   4   1

         */
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                if (!(col == 1 || col == row)) {
                    System.out.print("1");
                } else {
                    System.out.print("" + (row - 1));
                }
            }
        }
    }


    public static void hallowTrianglePattern(int num) {
        /*
         *
         *  *
         *    *
         *       *
         *********
         */
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        for (int col = 1; col <= num; col++) {
            System.out.print("* ");
        }

    }


    public static void sandClockPattern(int num) {
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         *
         * *
         * * *
         * * * *
         * * * * *

         * */
        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= num - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }


    public static void twoRightTriangleNumbered(int num) {
        /*
           1      1
           12    21
           123  321
           12344321
         */

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "");
            }
            for (int col = 1; col < (((num * 2) + 1) - row * 2); col++) {
                System.out.print(" ");
            }
            for (int col = row; col > 0; col--) {
                System.out.print(col + "");
            }
            System.out.println();
        }

    }

    public static void rightTrianlgeNumPattern() {
        /*
            1                1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */
        int num = 5;

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    public static void rotatedTrianglePatternColbased(int num) {

        /*

         */

        for (int row = 1; row <= 2 * num - 1; row++) {
            int columnLen = 0;
            if (row <= num) {
                columnLen = row;
            } else {
                columnLen = ((2 * num) - row);
            }
            for (int col = 1; col <= columnLen; col++) {
                System.out.print(col + "");
            }
            System.out.println();
        }
    }


    public static void rotatedTrianglePatternRowbased(int num) {

        /*

         */

        for (int r = 1; r <= num; r++) {
            if (r <= num / 2 + 1) {
                for (int c = 1; c <= r; c++) {
                    System.out.print("* ");
                }
            } else {
                for (int c = num - r + 1; c > 0; c--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }


    public static void trianglePattern(int num) {

        /*

         */
        for (int r = 1; r <= num * 2; r++) {

            if (r <= num) {
                for (int cStart = 1; cStart <= (num - r); cStart++) {
                    System.out.print(" ");
                }
                for (int cMid = 1; cMid <= r; cMid++) {
                    if (cMid <= r / 2) {
                        System.out.print(cMid + " ");
                    } else {
                        System.out.print((r - cMid) + 1 + " ");
                    }

                }
                for (int cEnd = 1; cEnd <= (num - r); cEnd++) {
                    System.out.print(" ");
                }
            } else {
                int newRow = (r - num);
                for (int cStart = newRow; cStart >= 1; cStart--) {
                    System.out.print(" ");
                }
                for (int cMid = num * 2 - r; cMid >= 1; cMid--) {
                    if (cMid <= newRow / 2) {
                        System.out.print(cMid + " ");
                    } else {
                        System.out.print(cMid + 1 + "<");
                    }

                }
                for (int cEnd = newRow; cEnd >= 1; cEnd--) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
