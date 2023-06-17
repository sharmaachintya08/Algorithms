package LeetCode;
//in this problem i will find the duplicate element in the array using the method of hashing
/**
    the logic for this program would be
        the array visited is indexed with the values of the array named array
        in the for loop we are doing 2 things at a time
            we are marking the value as true and checking if the indexed block is already true
                if it is already true then the value is duplicate because it occured before and marked true in the boolean array at the same index
        and if no value is found true then we have returned -1  
 */

class DuplicateElement{
    public static int DuplicateElement(int[] array){
        boolean visited[] = new boolean[array.length + 1];
        for(int value:array){
            if(visited[value]){
                return value;
            }
            visited[value] = true;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,1};
        int value = DuplicateElement(array);
        if(value!=-1){
            System.out.println("the duplicate value :- " + value);
        }
    }
}