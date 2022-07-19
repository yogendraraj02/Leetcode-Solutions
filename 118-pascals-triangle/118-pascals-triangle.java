class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer = new ArrayList<>(numRows); 
        for(int i=0; i < numRows; i++){
            List<Integer> inner = new ArrayList<>(i+1);
            for(int j=0; j <= i ; j++){
                    if(j == 0 || j == i){
                        inner.add(1);
                        continue;
                    }
                List<Integer> prev = outer.get(i-1);
                inner.add(prev.get(j-1) + prev.get(j));
            }
            outer.add(inner);
        }
        
        return outer;
    }
}