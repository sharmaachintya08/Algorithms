/*
 * problem :- QuickSelect Algorithm
 * problem set:- Quickselect is a selection algorithm to find the k'th smallest element in an unordered list. It is closely related to the Quicksort sorting algorithm. Like Quicksort, it is efficient traditionally and offers good average-case performance, but has a poor worst-case performance.
 */


class QuickSelect{
    public static int quickSelect(int[] arr, int lo, int hi, int k) {
        int pivot = arr[hi];
        int pi = partition(arr,pivot,lo,hi);
        if(k>pi){
            return quickSelect(arr,pi+1,hi,k);
        }
        else if(k<pi){
            return quickSelect(arr,lo,pi-1,k);
        }
        else{
            return arr[pi];
        }
      }
    
      public static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo, j = lo;
        while (i <= hi) {
          if (arr[i] <= pivot) {
            swap(arr, i, j);
            i++;
            j++;
          } else {
            i++;
          }
        }
        return (j - 1);
      }
    
      // used for swapping ith and jth elements of array
      public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    
      public static void main(String[] args) throws Exception {
        int[] arr = {7,4,6,3,9,1};
        int k = 2;
        System.out.println(quickSelect(arr,0,arr.length - 1,k - 1));
      }
}