#172. Factorial Trailing Zeroes
public Class LeetCode172 {
  public int trailingZeroes(int n) {
        int count=0;
        while(n>0) {
        n/=5;
        count+=n;
        }
        return n;
    }

}
