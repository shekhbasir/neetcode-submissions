class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        boolean kam=false;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    kam=true;
                }
            }
        }
        return kam;
    }
}