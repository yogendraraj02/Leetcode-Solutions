import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        
        
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i= 0; i < operations.length;  i++){
            char op = operations[i].charAt(0);
            
            if(op == '+'){
                int pop = st.pop();
                int top = st.peek();
                st.push(pop);
                st.push(top + pop);
                
            } else if(op == 'D') {
                int top = st.peek();
                st.push(top * 2);
                
            } else if(op == 'C') {
                st.pop();
            } else {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        
        
        int sum = 0;
        while(st.size() > 0){
            sum += st.pop();
        }
        
        return sum;
    }
}