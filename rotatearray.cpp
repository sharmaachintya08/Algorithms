//rotating the array by swapping them

#include <iostream>


using namespace std;

void swap(int &a,int &b)
{
    int temp = a;
    a = b;
    b = temp;
}
void rotate(int nums[], int n) {
    int low = 0;
    int high = n - 1;
    while(low <= high)
    {
        swap(nums[low],nums[high]);
        low++;
        high--;
    }
}
int main() 
{
    int arr[] = {1,2,3,4,5,6,7,8};
    rotate(arr,8);
    for(int i = 0 ; i < 8; i++)
    {
        cout << " " << arr[i];
    }
    return 0;
}
