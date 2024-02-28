//selection sort 



#include <iostream>

void swap(int &i, int &j)
{
    int temp = i;
    i = j;
    j = temp;
}

int main() {
    int arr[] = {1, 5, 2, 3, 0};
    int n = sizeof(arr) / sizeof(arr[0]);

    for(int i = 0 ; i < n - 1 ; i++)
    {
        int minIndex = i;
        for(int j = i + 1 ; j < n ; j++)
        {
            if(arr[j] < arr[minIndex])
            {
                minIndex = j;
            }
        }
        swap(arr[minIndex], arr[i]); 
    }

    for(int i = 0 ; i < n ; i++)
    {
        std::cout << arr[i] << " "; 
    }
    std::cout << std::endl; 
}
