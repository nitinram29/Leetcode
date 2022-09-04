class Solution {
    public int helper(char[] arr,int i,int j){
        String ans="";
        while(i>=0 && j<arr.length){
            if(arr[i]==arr[j]){
                i--;
                j++;
            }else break;
        }
        return j-i-1;        
    }
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        //String ans="";
        int st=0;
        int e=0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int x = helper(arr,i,i);
            int y = helper(arr,i,i+1);
            
            x=x>y?x:y;
            if(x>e-st){
                st = i-((x-1)/2);
                e = i+(x/2);
            }
        }
        return s.substring(st,e+1);        
    }
}