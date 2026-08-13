class Solution {
    public int[] twoSum(int[] nums, int target) {

       
        HashMap<Integer, Integer> st = new HashMap<>();
        int result[] = new int[2];

        for(int i = 0; i < nums.length; i++){

            int needed = target - nums[i];

            if(st.containsKey(needed)){
                result[0] = st.get(needed);
                result[1] = i;
                return result;
            }

            st.put(nums[i], i);
        }

        return result;
    }
}
