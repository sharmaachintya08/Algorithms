//in this problem an unsorted array will be given we will have to find a pair with a given sum in it
//we will be using brute force in this 

#include <stdio.h>

int main(){
    int nums[] = {2,3,4,5,10,10,11,15};
    int n = sizeof(nums)/sizeof(nums[0]);
    int answer=0;
    printf("\ntype the number you want to check \n");
    scanf("%d",&answer);
    Solution(nums,n,answer); 
    return 0;
}
void Solution(int nums[],int n ,int answer){
    for(int i = 0 ;i<n;i++){
        for(int j = i+1;j<n;j++){
            if(nums[i]+nums[j]==answer){
                printf("\n%d %d\n",nums[i],nums[j]);
            }
        }
    }
}