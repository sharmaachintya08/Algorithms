//time complexity of binary search in O(logn)
//binary search is a searching algorithm
//get it checked 
#include <stdio.h>

int BinarySearch(int array[],int low,int high,int key);
int main(){
    int array[]={1,10,50,12,25,50,77};
    int n = sizeof(array)/sizeof(array[0]);
    int low = 0;
    printf("type the element you want to search \n");
    int key = scanf("%d",&key);
    int index = BinarySearch(array,low,n-1,key);
    if(index==-1){
        printf("\n key element not found \n");
    }
    else{
        printf("\nindex :- %d\n",index);
    }
    return 0;
}
int BinarySearch(int array[],int low,int high,int key){
    int mid = (low+high)/2;
    if(low==high){
        return low;
    }
    else{
        if(key<array[mid]){
            BinarySearch(array,low,mid,key);
        }
        else if(key>array[mid]){
            BinarySearch(array,mid+1,high,key);
        }
        else{
            return mid;
        }
    }
    return -1;
}