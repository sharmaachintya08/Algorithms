//Binary to Decimal 
//cpp logic

#include <iostream.h>
#include <math.h>

int main()
{
  int n;
  cin >> n;

  int ans = 0;
  int i = 0;

  while(n!=0)
  {
    int bit = n & 1;
    ans = bit*pow(10,i) + ans;
    n = n >> 1;
    i++;
  }

  cout << "Answer is " << ans << endl;
}
