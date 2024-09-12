package in.codegrind.others.interviewexperiences.zoho24sep2024;


/*
Question 3:
Return the largest Prime Number that can be found in the diagonals of given array. If prime number is not found return -1;

Example 1:
input:
[ [1,2,3],
  [4,5,6],
  [7,8,9]
]

Output: 7

Example 2:
input:
[ [15,2,13],
  [24,5,60],
  [12,8,18]
]

Output: 13
 */


public class Q3LargestPrimeinMatrixDiagnols {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(findLargestPrimeInDiagonals(matrix1)); // Output: 7

        int[][] matrix2 = {
                {15, 2, 13},
                {24, 5, 60},
                {12, 8, 18}
        };
        System.out.println(findLargestPrimeInDiagonals(matrix2)); // Output: 13
    }

    public static int findLargestPrimeInDiagonals(int[][] matrix) {
        int n = matrix.length;
        int largestPrime = -1;

        for (int i = 0; i < n; i++) {
            int num1 = matrix[i][i]; // Left-to-right diagonal
            int num2 = matrix[i][n - 1 - i]; // Right-to-left diagonal

            if (isPrime(num1)) largestPrime = Math.max(largestPrime, num1);
            if (isPrime(num2)) largestPrime = Math.max(largestPrime, num2);
        }

        return largestPrime;
    }



    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
