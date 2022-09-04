class Solution {
    public int reverse(int x) {
        long ans=0;
        int i=10;
        while(x!=0){
            ans = ans*i + x%10;
            x/=10;            
        }
        if(ans<-2147483648 || ans>2147483647) return 0;
        return (int) ans;
    }
}