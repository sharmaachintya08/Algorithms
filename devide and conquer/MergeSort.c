//merge sort algorithm
//this is a sorting algorithm

#include <stdio.h>
#define n 7

void merge(int a[],int beg,int mid,int end){//this is for sorting and merging back the array
    int i,j,k;
    int n1= mid-beg+1;
    int n2 = end-mid;

    int LeftArray[n1],RightArray[n2];

    for(int i=0;i<n1;i++){
        LeftArray[i] = a[beg+i];
    }
    for(int j=0;j<n2;j++){
        RightArray[j]=a[mid+1+j];
    }

    i=0;
    j=0;
    k=beg;

    while(i<n1&&j<n2){
        if(LeftArray[i]<=RightArray[j]){
            a[k]=LeftArray[i];
            i++;
        }
        else{
            a[k]=RightArray[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        a[k]=LeftArray[i];
        i++;
        k++;
    }
    while(j<n2){
        a[k]=RightArray[j];
        j++;
        k++;
    }
}
void mergeSort(int a[],int beg,int end){//this is for devide and conquer
    if(beg<end){
        int mid = (beg+end)/2;
        mergeSort(a,beg,mid);
        mergeSort(a,mid+1,end);
        merge(a,beg,mid,end);
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
    printf("insert element in the array \n");
    for(int i=0;i<n;i++){
        scanf("%d",&array[i]);
    }
    printf("array before sorting \n");
    printArr(array);
    mergeSort(array,0,n-1);
    printf("array elements after sorting \n");
    printArr(array);
}