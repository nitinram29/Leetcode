class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        for(String i:strs){
            char[] ia = i.toCharArray();
            Arrays.sort(ia);
            String is = String.valueOf(ia);
            if(!map.containsKey(is)) map.put(is,new ArrayList<>());
            map.get(is).add(i);
        }
        return new ArrayList<>(map.values());
    }
}