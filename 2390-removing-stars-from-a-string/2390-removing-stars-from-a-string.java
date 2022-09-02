class Solution {
    public String removeStars(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char i:arr){
            if(i=='*') st.pop();
            else st.push(i);
        }
        StringBuilder ans= new StringBuilder();
        for(char i: st) ans.append(i);
       
        return ans.toString();
    }
}