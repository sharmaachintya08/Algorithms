//program for quick sort
//it has a time complexity of O(n^2)
#include <stdio.h>
#define n 5

int partition(int a[],int start,int end){
    int pivot = a[end];
    int i = (start-1);

    for(int j=start;j<=end-1;j++){
        if(a[j]<pivot){
            i++;
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
    int t = a[i+1];
    a[i+1] = a[end];
    a[end] = t;
    return (i+1);
}
void quick(int a[],int start,int end){
    if(start<end){
        int p = partition(a,start,end);
        quick(a,start,p-1);
        quick(a,p+1,end);
    }
}
void printArr(int a[]){
    for(int i=0;i<n;i++){
        printf("%d\t",a[i]);
    }
    printf("\n");
}
int main(){
    int array[n];
    printf("type the list to be sorted \n");
    for(int i=0;i<n;i++){
        scanf("%d",&array[i]);
    }
    printf("array before sorting \n");
    printArr(array);
    quick(array,0,n-1);
    printf("after sorting array elements \n");
    printArr(array);
    return 0;
}