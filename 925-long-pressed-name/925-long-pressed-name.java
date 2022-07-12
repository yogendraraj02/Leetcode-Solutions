class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0 , j = 0;
        
        while(i < name.length() && j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++; j++;
            }else{
                if(j > 0 && typed.charAt(j-1) == typed.charAt(j)) j++;
                else
                    return false;
            }
        }
        
        while(j < typed.length()){
             if(typed.charAt(j) != name.charAt(name.length()-1)){
                 return false;
             }
            j++;
        }
        return i == name.length();
    }
}