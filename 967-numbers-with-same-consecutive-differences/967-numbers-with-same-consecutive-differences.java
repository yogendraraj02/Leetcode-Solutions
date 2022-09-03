class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i <= 9 ; i++){
            helper(i , k , n,list);
        }
        int[] result = new int[list.size()];
        int j =0;
        for(int x : list){
            result[j++] = x; 
        } 
        return result;
    }
    public int len(int n){
        int c = 0;
        while(n!=0){
            n /= 10;
            c++;
        }
        return c;
    }
    public void helper(int n,int k,int olen,ArrayList<Integer> list){
        if(len(n) > olen){
            return;
        }
        if(len(n) == olen){
           list.add(n); 
           System.out.print(n+" ");
            return;
        }
        for(int j = 0; j <= 9;j++){
            
            int nNum = numForm(n,j);
           // System.out.println("called:"+nNum);
            int ld = nNum % 10;
            int sld = (nNum/10) % 10;
            if(Math.abs(ld - sld) == k){
                //System.out.println("called:"+nNum);
                helper(nNum,k,olen,list);
            }
            nNum = nNum/10;
        }
    }
    public int numForm(int n,int d){
        int newNum = n *10 + d;
        return newNum;
    }
}