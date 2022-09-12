class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int i = 0 , j = tokens.length - 1;
        int score = 0 , points= 0;
        
        while(i <= j){
            
            if(power >= tokens[i]){
                power -= tokens[i++];
                score = Math.max(score , ++points);
            } else if(score > 0){
                points--;
                power += tokens[j--];
            } else {
                break;
            }
        }
        return score;
    }
}