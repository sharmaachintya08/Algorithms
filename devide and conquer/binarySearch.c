//time complexity of binary search in O(logn)
//binary search is a searching algorithm
#include <stdio.h>
#define n 7

int binarySearch(int a[],int beg,int end,int val){
    int mid;
    if(end>=beg){
        mid=(beg+end)/2;
        if(a[mid]==val){
            return mid+1;
        }
        else if(a[mid]<val){//this means the value is greater than the mid value 
            return binarySearch(a,mid+1,end,val);
        }
        else{
            return binarySearch(a,beg,mid-1,val);
        }
    }
    return -1;
}
int main(){
    int array[]={1,2,3,4,5,6,7},val;
    int res;
    printf("type the value to be searched : \n");
    scanf("%d",&val);
    res = binarySearch(array,0,n-1,val);
    if(res==-1){
        printf("the element is not present in the array \n");
    }
    else{
        printf("element is present at : %d",res);
        printf("\n");
    }
}