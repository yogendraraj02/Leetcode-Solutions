class NumArray {
    int arr[];
    int segment[];
    int n;
    public void build(int idx,int low ,int high){
        if(low == high){
            segment[idx] = arr[low];
            return;
        }
        int mid = (high+low)/2;
        build(2 * idx + 1, low, mid);
        build(2 * idx + 2, mid + 1, high);
        segment[idx] = segment[2 * idx + 1] + segment[2 * idx + 2];
    }
    
    public NumArray(int[] nums) {
        this.n = nums.length;
        this.arr = nums;
        this.segment = new int[4 * n];
        build(0 , 0 , n-1);
    }
    
    public void update(int index, int val) {
        //arr[index] = val;
        // this.arr[index] = val;
        updateTree(0,0,n-1,index,val);
    }
    private void updateTree(int idx, int left, int right, int index, int val) {
        // base case
        if (left == right) {
            segment[idx] = val;
            return;
        }
        
        // hypothesis
        int mid = left + (right - left) / 2;
        if (index <= mid)
            updateTree(2 * idx + 1, left, mid, index, val);
        else
            updateTree(2 * idx + 2, mid + 1, right, index, val);
        
        // induction step - updating the parent as the children got updated
        segment[idx] = segment[2 * idx + 1] + segment[2 * idx + 2];
    }
    public int query(int idx,int low,int high, int l,int r){
        if(low >= l && high <= r){
            return segment[idx];
        }
        if(high < l || low > r) return 0;
        int mid = (high + low)/2;
        int left = query(2 * idx + 1, low , mid , l,r);
        int right = query(2 * idx + 2, mid  + 1 , high , l,r);
        return left + right;
    }
    public int sumRange(int left, int right) {
           return query(0, 0,n-1 , left , right); 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */