/**
    this is a boyer moore voting program for finding the majority element
 */

class MooreVoting{
    public static void mooreVoting(int[] array){
        int count = 1;
        int majorityElement = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i]!=array[i-1]){
                count --;
                majorityElement = array[i];
                count++;
            }
            else{
                count++;
            }
        }
        System.out.println(majorityElement);
    }
    public static void main(String[] args){
        int[] array = {2,2,3,3,3,1,3,2,3,3,3};
        mooreVoting(array);
    }
}
/**
    this program doesnt always tell the majority answer 
    time complexity:- O(n);
    space complexity :- O(1);
 */