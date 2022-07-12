class Solution {
    public int distributeCandies(int[] c) {
        HashSet<Integer> hset = new HashSet<>();
        int n = c.length;
        for(int ele : c){
            hset.add(ele);
        }
        if(hset.size() <= n/2)
            return hset.size();
        return n/2;
    }
}