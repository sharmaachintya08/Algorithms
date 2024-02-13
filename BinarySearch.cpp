//Binary Search


#include <iostream>

int binarySearch(int arr[], int low, int high, int k)
{
    if (low <= high)
    {
        int mid = low + (high - low) / 2;

        if (arr[mid] == k)
        {
            return mid;
        }
        else if (arr[mid] > k)
        {
            return binarySearch(arr, low, mid - 1, k);
        }
        else
        {
            return binarySearch(arr, mid + 1, high, k);
        }
    }
    return -1;
}

int main() {
    
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int low = 0;
    int high = sizeof(arr) / sizeof(arr[0]) - 1; 
    int k = 3;
    int ans = binarySearch(arr, low, high, k); 
    std::cout << ans;
    return 0;
}
