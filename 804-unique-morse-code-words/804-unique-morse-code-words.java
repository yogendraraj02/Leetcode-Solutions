class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        // String[] codes = new String[26];
        String codes[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> hset = new HashSet<>();
        
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(char ch : word.toCharArray()){
                
                String charCode = codes[ch - 'a'];
                sb.append(charCode);
            }
            hset.add(sb.toString());
        }
        //System.out.println(hset);
        return hset.size();
    }
}