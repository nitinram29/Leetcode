class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int ans=0;
        for(int i=0,j=1;j<intervals.length;j++){
            if(intervals[j][0]<intervals[i][1]){
                ans++;
            }else {
                i=j;
            }
        }
        return ans;
    }
}