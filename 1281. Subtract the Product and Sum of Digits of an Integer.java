class Solution {
    public int subtractProductAndSum(int n) {
        int d=0;
        int m=1,r=0,s=0;
        while(n>0)
        {
            d=n%10;
            m= m*d;
            s = s+d;
            n=n/10;
        }
        r=m-s;
        return r;
    }
}