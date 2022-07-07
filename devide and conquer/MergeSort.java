//this is a merge sort program
//this uses devide and conquer technique
/**
    merge sort has the time complexity of :- o(nlogn) in worst case
 */

public class MergeSort{
    public static void Merge(int[] array,int low,int mid,int high){
        int i = low;
        int j = mid+1;
        int k = low;
        int[] temp = new int[array.length];
        while(i<=mid&&j<=high){
            if(array[i]<array[j]){
               temp[k] = array[i];
               i++; 
            }
            else{
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=high){
                temp[k]=array[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid){
                temp[k]=array[i];
                i++;
                k++;
            }
        }
        for(k=low;k<=high;k++){
            array[k] = temp[k];
        }
    }
    public static void MergeSort(int[] array,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            MergeSort(array,low,mid);
            MergeSort(array,mid+1,high);
            Merge(array,low,mid,high);
        }
    }
    public static void main(String[] args){
        int[] array = {10,2,15,1,25,40};
        MergeSort(array,0,array.length-1);
    }
}