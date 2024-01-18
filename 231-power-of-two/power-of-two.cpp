class Solution {
public:
    bool isPowerOfTwo(int n) {
        int i = 0;
        int ans = 1;
        while(i<=30)
        {
            if(ans == n)
            {
                return true;
            }
            if(ans < INT_MAX/2)
                ans = ans * 2;
            i++;
        }
        return false;
    }
};