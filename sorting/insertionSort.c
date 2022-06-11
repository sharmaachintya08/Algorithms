//having a time complexity of o(n^2)
#include <stdio.h>
#define n 7

void insertionSort(int a[]){
    int i,j,temp;
    for(i=1;i<n;i++){
        temp=a[i];
        j=i-1;
        while(j>=0&&temp<=a[i]){
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=temp;
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
    printf("insert the following list to be sorted \n");
    for(int i=0;i<n;i++){
        scanf("%d\t",&array[i]);
    }   
    printf("before sorting array elements are :- \n");
    printArr(array);
    insertionSort(array);
    printf("array after sorting \n");
    printArr(array);
    return 0;
}