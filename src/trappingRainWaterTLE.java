class Solution {
    public int trap(int[] height) {
        int ans = 0;
        for(int i = 1; i < height.length-1;i++){
            int lmax = height[i-1];
            int rmax = height[i+1];
            for(int j = i-1; j>=0; j--){
                lmax = Math.max(lmax,height[j]);
            }
            for(int k = i+1; k < height.length; k++){
                rmax = Math.max(rmax,height[k]);
            }
            ans += Math.max(Math.min(lmax,rmax)-height[i],0);
        }
        return ans;
    }
}