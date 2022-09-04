class Solution {
    public String helper(char[] arr,int i,int j){
        String ans="";
        while(i>=0 && j<arr.length){
            if(arr[i]==arr[j]){
                if(i!=j)
                ans = ""+arr[i]+ans+arr[j];
                else ans+=arr[i];
            }else return ans;
            i--;
            j++;
        }
        return ans;        
    }
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        String ans="";
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            String x = helper(arr,i,i);
            String y = helper(arr,i,i+1);
            String tmp = x.length()>y.length()?x:y;
            ans = tmp.length()>ans.length()?tmp:ans;
        }
        return ans;        
    }
}