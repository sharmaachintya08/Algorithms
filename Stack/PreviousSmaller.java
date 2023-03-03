//Previous smaller element

package Algorithms.Stack;

import java.util.Stack;

public class PreviousSmaller {
    public void findPreviousSmallerElement(int arr[]){
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < arr.length){
            if(stack.isEmpty()){
                System.out.print("\t -1");
                stack.push(arr[i]);
                i++;
            }else{
                if(stack.peek() < arr[i]){
                    System.out.print("\t "+stack.peek());
                    stack.push(arr[i]);
                    i++;
                }else{
                    stack.pop();
                }
            }
        }
    }
    public static void main(String[] args){
        PreviousSmaller ps = new PreviousSmaller();
        int arr[] = {4,10,5,8,20,15,3,12};
        ps.findPreviousSmallerElement(arr);
    }
}
