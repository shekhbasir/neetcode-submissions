class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        boolean kam=false;
        HashSet<Integer> st=new HashSet<>();

        for(Integer hamarval:nums){
            if(st.contains(hamarval)){
                return true;
            }
            st.add(hamarval);
        }
        return false;
    }
}