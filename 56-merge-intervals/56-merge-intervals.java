class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(l1,l2)->Integer.compare(l1[0],l2[0]));
        List<int[]> list = new ArrayList<>();
        for(int[] i:intervals){
            
            if(list.isEmpty() || list.get(list.size()-1)[1]<i[0]){
                list.add(i);
            }
            else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1],i[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}