/*
 * problem :- Find all elements in an array that are greater than all elements to their right
 * problem set :- Given an unsorted integer array, print all greater elements than all elements present to their right.
 */

import java.util.Stack;

class RightGreaterElements {
    public static void findGreaterElements(int[] A) {
        if (A == null || A.length == 0) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        for (int value : A) {
            while (!stack.isEmpty() && stack.peek() < value) {
                stack.pop();
            }
            stack.push(value);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        int[] A = { 10, 4, 6, 3, 5 };
        findGreaterElements(A);
    }
}
/*
 * tc :- O(N);
 * sc :- O(N);
 */