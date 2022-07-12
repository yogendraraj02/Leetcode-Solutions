import java.util.*;
class Solution {
    public boolean makesquare(int[] matchsticks) {
        int perimeter  =0;
        for(int ele : matchsticks){
            perimeter += ele;
        }
        if(perimeter % 4 != 0) return false;
        int target = perimeter /4;
        int[] sides = new int[4];
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        
        boolean possible = backtrack(matchsticks, sides,0 , target);
        return possible;
    }
    public void reverse(int[] arr){
        int n = arr.length;
        for(int i=0; i < n/2;i++){
            int temp = arr[n - i - 1];
            arr[n - i -1] = arr[i];
            arr[i] = temp;
        }
    }
    public boolean backtrack(int[] arr ,int[] sides,int idx, int tar){
        if(idx == arr.length){
            if(sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3] && sides[3] == sides[0])
                return true;
            return false;
        }
        
        for(int i=0; i < sides.length ; i++){
            if(arr[idx] > tar){
                return false;
            }
            if(sides[i] + arr[idx] > tar)
                continue;
            sides[i] += arr[idx];
            if(backtrack(arr,sides,idx+1,tar))
                return true;
            
            sides[i] -= arr[idx]; //backtrack
        }
        return false;
    }
}