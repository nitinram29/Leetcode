class Solution {
    
    public int findPalindrom(String s,int st,int e){
        int i=st,j=e;
        int ans=0;
        while(i>=0 && j<s.length()){
            if(s.charAt(i)==s.charAt(j)) ans++;
            else break;
            i--;
            j++;
        }
        return ans;
    }
    
    public int countSubstrings(String s) {
        int ans=0;
        
        for(int i=0;i<s.length();i++){
            ans+=findPalindrom(s,i,i);
            ans+=findPalindrom(s,i,i+1);
        }
        
        return ans;
    }
}

//Palindromic String