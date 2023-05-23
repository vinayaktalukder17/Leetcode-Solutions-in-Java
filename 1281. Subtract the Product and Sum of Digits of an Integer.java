class Solution {
    public int subtractProductAndSum(int n) {
        int digit=0;
        int prod=1,result=0,sum=0; //variable for product should be assigned with the value 1
        while(n>0)
        {
            digit=n%10; // To find the latest digit
            prod= prod*digit; // Prouct of all digits
            sum = sum+digit; // Sum of all digits
            n=n/10;
        }
        result = prod - sum;
        return result;
    }
}
