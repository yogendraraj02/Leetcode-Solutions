class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        // String[] codes = new String[26];
        String codes[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String,Boolean> hset = new HashMap<>();
        
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(char ch : word.toCharArray()){
                
                String charCode = codes[ch - 'a'];
                sb.append(charCode);
            }
            hset.put(sb.toString(),false);
        }
        //System.out.println(hset);
        return hset.size();
    }
}