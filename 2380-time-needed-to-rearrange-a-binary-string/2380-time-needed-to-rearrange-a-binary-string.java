class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int ans=0;
        while(!s.equals(s.replaceAll("01","10"))){
            s = s.replaceAll("01","10");
            ans++;         
        }
        return ans;        
    }
}