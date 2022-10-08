class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int n = height.length;
        
        int ctr = height[0];
        for(int i =0; i<n; i++){
            ctr = Math.max(ctr,height[i]);
            
            left[i] = ctr;
        }
        
        ctr = height[n-1];
        for(int i =n-1; i>=0; i--){
            ctr = Math.max(ctr,height[i]);
            right[i] = ctr;
        }
        int res = 0;
        
        for(int i =0; i<n; i++){
            res += Math.min(left[i], right[i])-height[i];
        }
        
        return res;
    }
}
