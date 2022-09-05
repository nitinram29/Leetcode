class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int ans=0;
        for(int i=0,j=1;j<intervals.length;j++){
            int[] tmp = intervals[i];
            int[] tmp1 = intervals[j];
            if(tmp1[0]<tmp[1]){
                ans++;
            }else {
                i=j;
            }
        }
        return ans;
    }
}