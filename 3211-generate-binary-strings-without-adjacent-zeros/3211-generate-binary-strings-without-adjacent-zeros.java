import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public List<String> helperFun(int n) {
        if (n == 1) {
            return new ArrayList<>(List.of("0", "1"));
        }
        
        List<String> smallerStrings = helperFun(n - 1);
        List<String> ans = new ArrayList<>();
        
        for (String s : smallerStrings) {
            if (s.charAt(s.length() - 1) != '0') {
                ans.add(s + "0");
            }
            ans.add(s + "1");
        }
        
        return ans;
    }

    public List<String> validStrings(int n) {
        if (n <= 0) {
            return new ArrayList<>(); 
        }
        return helperFun(n);
    }
}

    