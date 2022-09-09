class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        // Got the solution but it's COPIED
        int n = properties.length;
        int count = 0;
        Arrays.sort(properties, (a, b) -> (b[0] == a[0]) ? (b[1] - a[1]) : a[0] - b[0]);
        int max = 0;
        for (int i = n-1;i>=0;i--) {
            if (properties[i][1] < max) {
                count++;
            }else max =  properties[i][1];
        }
        return count;
    }
}