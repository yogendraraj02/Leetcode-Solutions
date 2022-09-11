class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b)-> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        
        int start = 0;
        int i = 1;
        while(i < intervals.length){
            int ith_start = intervals[i][0];
            int ith_end = intervals[i][1];
            
            if(intervals[start][1] >= ith_start){
                intervals[start][1] = Math.max(intervals[start][1],ith_end);
            } else {
                result.add(new int[]{intervals[start][0],intervals[start][1]});
                start = i;
            }
            i++;
        }
        result.add(new int[]{intervals[start][0],intervals[start][1]});
        return result.toArray(new int[0][0]);
        
    }
}