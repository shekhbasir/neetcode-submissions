class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        boolean kam=false;
        int n=nums.length;
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }

        if(n!=st.size()){
            kam=true;
        }

        return kam;
    }
}