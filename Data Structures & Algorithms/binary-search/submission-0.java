class Solution {

    public static int kamkar(int[] arr,int target){
        int first=0;
        int n=arr.length-1;
        int last=n;

        while (first <= last){
            int mid=(first+last)/2;
            if(target==arr[mid]) return mid;

            if(target>arr[mid]){
                first=mid+1;
                
            }
            if(target<arr[mid]){
                last=mid-1;
                
            }

            
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return kamkar (nums,target);
    }
}
