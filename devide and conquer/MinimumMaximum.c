//minimum maximum by devide and conquer method program


#include <stdio.h>
struct pair
{
    int min;
    int max;
};
struct pair getMinMax(int arr[],int n){
    struct pair minmax;
    int i;

    if(n==1){//there is only one element so return
        minmax.max = arr[0];
        minmax.min = arr[0];
        return minmax;
    }

    if(arr[0]>arr[1])//if there are more than one element then pair min max
    {
        minmax.max = arr[0];
        minmax.min = arr[1];
    }
    else{
        minmax.max = arr[1];
        minmax.min = arr[0];
    }
    for(i=2;i<n;i++){
        if(arr[i]>minmax.max){
            minmax.max = arr[i];
        }
        else if(arr[i]<minmax.max){
            minmax.max = arr[i];
        }
        return minmax;
    }
}
int main(){
    int arr[] = {1000,11,445,1,330,3000};
    int arr_size = 6;
    struct pair minmax = getMinMax(arr,arr_size);
    printf("the minimum element is %d\n",minmax.min);
    printf("Maximum element is %d\n",minmax.max);
    getchar();
}