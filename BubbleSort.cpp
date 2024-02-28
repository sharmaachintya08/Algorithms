//Bubble sort

#include <iostream>

void swap(int &i, int &j)
{
    int temp = i;
    i = j;
    j = temp;
}

int main() {
    int arr[] = {10, 1, 7, 6, 14, 9};
    int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = 1; i < n; i++) {
        bool swapped = false;
        for (int j = 0; j < n - i; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }

    for (int i = 0; i < n; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}
