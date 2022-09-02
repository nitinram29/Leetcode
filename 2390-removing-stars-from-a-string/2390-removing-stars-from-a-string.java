class Solution {
    public String removeStars(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char i:arr){
            if(i=='*') st.pop();
            else st.push(i);
        }
        String ans="";
        while(!st.isEmpty()){
            ans =  st.pop()+ans;
        }
        return ans;
    }
}