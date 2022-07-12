class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder(s.length());
        StringBuilder sb2 = new StringBuilder(s.length());
        for(int i=0 ; i < s.length();i++){
            
            char ch = s.charAt(i);
            
            if(ch >= 65 && ch <= 90){
                sb1.append((char)(s.charAt(i) | ' '));
            }
            else if((ch >= 97 && ch <= 122) ){
                sb1.append(ch);
                
            } else if(ch >= 48 && ch <= 57){
                sb1.append(ch);
            }
        }
        for(int i=s.length()-1 ; i>=0;i--){
            char ch = s.charAt(i);
            
            //System.out.print(ch + " ");
            if(ch >= 65 && ch <= 90){
                sb2.append((char)(s.charAt(i) | ' '));
            }
            else if((ch >= 97 && ch <= 122) ){
                sb2.append(ch);
                
            } else if(ch >= 48 && ch <= 57){
                sb2.append(ch);
            }
        }
        //System.out.println(sb1);
        //System.out.println(sb2);
        
        return sb1.compareTo(sb2) == 0;
    }
}