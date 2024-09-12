package in.codegrind.others.interviewexperiences.zoho24sep2024;

import java.util.ArrayList;
import java.util.List;


/*

Question-2:
Return a array of Numbers who's sum of their square rootsgives the cummulative sum of the given input:

Example 1:
Input: 13
Output: [2,3]
Explanation:
2x2 = 4
3x3 = 9
sum of 4 and 9 = 13

Example 2:
Input: 24
Output: [1,1,1,2,4]
Explanation:
(1x1) + (1x1) + (1x1) + (2x2) + (4x4)
1 + 1 + 1 + 1 + 4 + 16 =  24


 */
public class Q2SumOfSqNumbers {

    public static List<Integer> findSquares(int n) {
        List<Integer> result = new ArrayList<>();
        int remaining = n;


        while (remaining > 0) {
            int sqrt = (int) Math.sqrt(remaining);
            result.add(sqrt);
            remaining -= sqrt * sqrt;
            //System.out.println(" -> " + result.toString() );
        }
        //System.out.println(" res : " + result.toString() );
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSquares(13)); // Output: [2, 3]
        System.out.println(findSquares(23)); // Output: [4, 2, 1, 1, 1, 1]
    }

}
