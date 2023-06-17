/**
    in this problem we have to reorder zero at the last of the array
 */
/**
    the logic of this program is we are taking pivot as 0 and swapping when ever i is not equal to pivot and incrementing pivot one time
 */
class ReorderZero{
    static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static void reOrder(int[] array){
        int pivot = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                swap(array,i,pivot);
                pivot++;
            }
        }
    }
    public static void main(String[] args){
        int[]  array = {0,0,1,2,3,0};
        reOrder(array);
        for(int elements : array){
            System.out.println(elements);
        }
    }
}
/**
    time complexity :- O(n);
    space complexity :- O(1);
 */