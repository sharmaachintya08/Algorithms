/**
    in this problem we have 3 numbers 0 1 and 2 and according to the theory these numbers has represented each colour of the dutch national flag
    , we have to sort these numbers in the ascending order , for this we can use any sorting algorithm with the time complexity of O(nlogn) but 
    our constraint is to solve this problem in O(n) time complexity 
 */
/**
    the logic for this problem is :-
        there will be 3 pointer i,j,k and elements before i will be low elements and elements between i and j will be the middle elements
        and the elements between j and k will be the unknown elements and elements after k will be the high elements
        To do that we take i,j pointer at the starting element and k pointer at the last element if the element at the j element is 1
        we will do j++ and if the element is 0 we will swap it with the i element and do i++ , now we dont know the element at the j 
        so we check the element at the j and if j element is 2 we will swap it with the k element
        if j and k has overlapped that means the array has been sorted in linear time
 */
public class DutchNationalFlag{
    public static void swap(int[] array,int el,int pivot ){
        int temp = array[el];
        array[el] = array[pivot];
        array[pivot] = temp;
    }
    public static void DutchNationalFlag(int[] array){
        int n = array.length;
        int i = 0;
        int pivot = 0;
        int k = n-1;
        while(pivot<=k){
            if(array[pivot]==0){
               swap(array,i++,pivot++);
            }
            else if(array[pivot]==2){
                swap(array,k--,pivot);
            }
            else{
                pivot++;
            }
        } 
        for(int element : array){
            System.out.println(element);
        }
    }
    public static void main(String[] args){
        int[] array = {0,1,2,1,0,0,2,1};
        DutchNationalFlag(array);
    }
}