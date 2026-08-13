
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> st = new HashMap<>();
        int arr[] = new int[k];

        // step 1: counting
        for (int kam : nums) {
            if (!st.containsKey(kam)) {
                st.put(kam, 1);
            } else {
                int sam = st.get(kam);
                st.put(kam, sam + 1);
            }
        }

        // step 2: k baar max nikalna
        for (int i = 0; i < k; i++) {

            int max = 0;
            int key = 0;

            // hashmap par traversal
            for (int val : st.keySet()) {
                if (st.get(val) > max) {
                    max = st.get(val);
                    key = val;
                }
            }

            arr[i] = key;   // max wala element array me daal do
            st.remove(key); // remove so next max mil sake
        }

        return arr;
    }
}
