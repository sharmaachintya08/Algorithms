/**
    in this problem set we have to rearrange the array such a way that the element at the i position should be greater than the element 
    at the i-1 position and i+1 position 
 */

class RearrangeArray{
    static void swap(int[] array , int j ,int i){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static void RearrangeArray(int[] array){
        for(int i=1;i<array.length -1;i=i+2){
            if(array[i-1]>array[i]){
                swap(array,i-1,i);
            }
            if(i+1<array.length&&array[i+1]>array[i]){
                swap(array,i+1,i);
            }
        }
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        RearrangeArray(array);
        for(int element:array){
            System.out.println(element);
        }
    }
}
/**
    since the array is incrementing at the rate of 2 , the time complexity would be in the form of logn base 2 and due to the if statement
    which is occuring n times , the total time complexity would be nlogn

    and the space complexity of the program O(1) it is constant because it has a fixed input size and that means the array size will also be fixed

 */