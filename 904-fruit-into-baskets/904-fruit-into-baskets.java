class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int winstart = 0 ,ans =1;
        for(int winend =0; winend < fruits.length ; winend++){
            map.put(fruits[winend],map.getOrDefault(fruits[winend],0)+1);
            
            while(winstart < fruits.length && map.size() > 2){
                map.put(fruits[winstart],map.get(fruits[winstart])-1);
                if(map.get(fruits[winstart]) == 0){
                    map.remove(fruits[winstart]);
                }
                winstart++;
            }
            if(map.size() <= 2){
                ans = Math.max(winend - winstart + 1, ans);
            }
        }
        return ans;
    }
}