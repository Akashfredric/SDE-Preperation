package in.codegrind.others.interviewexperiences.zoho24sep2024;


import java.util.Stack;

/*
Question 4:
Find the longest substring that follows the pattern '()' from the given input string and return the length of the String along with starting and ending index positions of the substring result.

Example 1:
Input: (()())))
Output: Length: 4 , indexes [ 1, 4 ]


Example 2:
Input: ((())))
Output: Length: 2 , indexes [ 2, 3 ]



Example 3:
Input: ((()()())()()()()))))(
Output: Length: 8 , indexes [ 9, 16 ]

 */
public class Q4paranthesisPattern {


    public static void main(String[] args) {
        int[] result1 = findLongestValidSubstring("(()())))");
        System.out.printf("Length: %d, indexes [%d, %d]%n", result1[0], result1[1], result1[2]); // Output: Length: 4, indexes [1, 4]

        int[] result2 = findLongestValidSubstring("((())))");
        System.out.printf("Length: %d, indexes [%d, %d]%n", result2[0], result2[1], result2[2]); // Output: Length: 2, indexes [2, 3]

        int[] result3 = findLongestValidSubstring("((()()())()()()()))))(");
        System.out.printf("Length: %d, indexes [%d, %d]%n", result3[0], result3[1], result3[2]); // Output: Length: 8, indexes [9, 16]
    }

    // Aproach-01 : Using Stack DataStructure
    public static int[] findLongestValidSubstring(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Base index for valid substring

        int maxLength = 0;
        int start = -1, end = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    int length = i - stack.peek();
                    if (length > maxLength) {
                        maxLength = length;
                        start = stack.peek() + 1;
                        end = i;
                    }
                }
            }
        }

        return new int[]{maxLength, start, end};
    }


    //Approach-02 : Using Two Pointers:
    public static int[] findLongestValidSubstringUsingTwoPointers(String s) {
        int left = 0, right = 0, maxLength = 0, start = -1, end = -1;

        // Left to Right scan
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                int length = 2 * right;
                if (length > maxLength) {
                    maxLength = length;
                    start = i - length + 1;
                    end = i;
                }
            } else if (right > left) {
                left = right = 0;  // Reset when closing brackets exceed opening
            }
        }

        // Right to Left scan
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') {
                right++;
            } else {
                left++;
            }

            if (left == right) {
                int length = 2 * left;
                if (length > maxLength) {
                    maxLength = length;
                    start = i;
                    end = i + length - 1;
                }
            } else if (left > right) {
                left = right = 0;  // Reset when opening brackets exceed closing
            }
        }

        return new int[]{maxLength, start, end};
    }



}
