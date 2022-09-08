class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones) q.add(i);
        while(q.size()>1){
            int t = q.poll();
            int t1 = q.poll();
            if(t!=t1) q.add(t-t1);
        }
        return q.size()==0?0:q.poll();   
    }
}