class Solution {
    public int passThePillow(int n, int time) {
        int q =  time / (n - 1);
        int r = time % (n - 1);
        if (q % 2 == 0){
            return 1 + r;
        }   
        
        return n - r;    
    }
}