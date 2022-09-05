class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            int[][] ans = new int[1][2];
            ans[0][0]=newInterval[0];
            ans[0][1]=newInterval[1];
            return ans;
        } 
        
        List<List<Integer>> list = new ArrayList<>();
        int f=0;
        int j=0;
        for(int[] i:intervals){
            List<Integer> l = null;
            if(newInterval[0]<i[0] && f==0){
                l = new ArrayList<>();
                l.add(newInterval[0]);
                l.add(newInterval[1]);
                list.add(l);
                f=1;
            }
            l = new ArrayList<>();
            l.add(i[0]);
            l.add(i[1]);
            list.add(l);
        }
        if(f==0) {
            List<Integer> l = new ArrayList<>();
            l.add(newInterval[0]);
            l.add(newInterval[1]);
            list.add(l);
        }
       
        for(int i=0;i<list.size()-1;i++){
            List<Integer> tmp =  list.get(i);
            List<Integer> tmp1 =  list.get(i+1);
            if(tmp.get(1)>=tmp1.get(0)){
                if(tmp.get(1)<=tmp1.get(1)) tmp.set(1,tmp1.get(1));
                list.remove(i+1);
                i--;
            }   
        }
        int[][] ans = new int[list.size()][2];
        int ind=0;
        for(List<Integer> l: list){
            ans[ind][0] = l.get(0);
            ans[ind][1] = l.get(1);    
            ind++;
        }
        return ans;
    }
}