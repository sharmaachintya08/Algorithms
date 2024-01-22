#linear search 


#include <iostream>

using namespace std;

bool linearSearch(int arr[], int size, int key)
{
    int i = 0;
    while(i < size)
    {
        if(key == arr[i])
        {
            return true;
        }
        i++;
    }
    return false;
}
int main() 
{
    int array[] = {1,2,3,4,5,6,7,8};
    bool ans = linearSearch(array,8,4);
    cout << ans;
    return 0;
}
