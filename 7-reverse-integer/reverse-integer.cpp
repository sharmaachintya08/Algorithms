class Solution {
public:
    int reverse(int n) {
        int reverse = 0;
        while(n!=0)
        {
            if(reverse < INT_MIN/10 || reverse > INT_MAX/10)
            {
                return 0;
            }
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }

        return reverse;
    }
};