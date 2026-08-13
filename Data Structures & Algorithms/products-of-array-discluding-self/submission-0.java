class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];

     
        for(int i=0;i<nums.length;i++){
               int mul=1;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                mul=mul*nums[j];
                
            }
            arr[i]=mul;
            mul=1;
           
        }
        return arr;
    }
}  


//like this i am going to implement the problem with 100% of th
