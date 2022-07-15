class Solution {
    public long sumofterms(long n){
        if((n &1 )==1){
            return (n+1)/2 * n;
        }
        return n/2 * (n+1);
    }
    public int arrangeCoins(int n) {
          if (n <= 1) {
            return n;
        }
        if (n <= 3) {
            return n == 3 ? 2 : 1;
        }
        long s = 0;
        long e = n/2;
        while( s <= e){
            long mid = s + (e-s)/2;
            long  sum = sumofterms(mid);
            if(sum == n)    return (int)mid;
            if(sum > n){
                e = mid-1;
            } else{
                s = mid+1;
            }
        }
        return (int) e;
    }
}