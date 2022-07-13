class Solution {
    public int heightChecker(int[] heights) {
        int[] counter = new int[101];
        for(int i=0; i < heights.length;  i++){
            counter[heights[i]]++;
        }
        int i = 0 , j = 0 , cnt = 0;
        while(i < counter.length){
            if(counter[i] == 0 ){
                i++;
                continue;
            } 
            else{
                if(i != heights[j]) cnt++;
                counter[i]--;
                j++;
                i--;
            }
            i++;
        }
        return cnt;
    }
}