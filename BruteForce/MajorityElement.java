/**
    in this problem we have to find the majority element , a majority element is the element which is appearing more than n/2 times
    in an array
    in this program we are using the bruteforce method
*/

class MajorityElement{
    static void majorityElement(int[] array){
        int count = 0;
        int n = (array.length)/2;
        for(int i=0;i<n/2;i++){
            for(int j=i;j<array.length;j++){
               if(array[i]==array[j]){
                    count++;
               } 
            }
            if(count > n){
                System.out.println(array[i]);
                count = 0;
            }
        }
    }
    public static void main(String[] args){
        int[] array = {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2,8,8,8,8,8,9,9,10,10,10};
        majorityElement(array);    
    }
}
/**
    time complexity :- O(n^2);
    space complexity :- O(1);
 */