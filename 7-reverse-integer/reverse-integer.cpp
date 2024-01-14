class Solution {
public:
    int reverse(int x) {
        long Nnum = 0;
        while(x!=0)
        {
            Nnum = (Nnum * 10) + (x%10);
            if(Nnum < INT_MIN || Nnum > INT_MAX)
            {
                return 0;
            }
            x = x/10;
        }
        return Nnum;
    }
};