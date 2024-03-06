//insertionsort

#include <iostream>
#include <vector>

void insertionSort(int n, std::vector<int> &arr) {
    int i = 1;
    while(i < n) {
        int temp = arr[i];
        int j = i - 1;
        while(j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
        i++;
    }
}

int main() {
    std::vector<int> arr = {3, 2, 6, 1, 0};
    insertionSort(arr.size(), arr);
    
    // Print sorted array
    for (int num : arr) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}
