class Solution {
public:
    int bitwiseComplement(int n) {
        if ( n == 0 ) return 1;
        int mask = 1;
        while(mask <= n){
            n ^= mask;
            mask <<= 1;
        }
        cout << "n" << n;
        return n;
    }
};