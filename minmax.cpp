//minmax algo 

#include <iostream>
#define INT_MIN 0;
#define INT_MAX 999999;

using namespace std;


void findMax(int arr[], int size)
{
    int max_element = INT_MIN;
    int min_element = INT_MAX;
    int i = 0;
    while(i < size)
    {
        if(arr[i] > max_element)
        {
            max_element = arr[i];
        }
        if(arr[i] < min_element)
        {
            min_element = arr[i];
        }
        i++;
    }
    cout << "maximum element: " << max_element << endl;
    cout << "minimum element: " << min_element << endl;
}
int main() 
{
    int array[10] = {1,2,3,4,5,6,7,8,9,10};
    findMax(array,10);
    return 0;
}
