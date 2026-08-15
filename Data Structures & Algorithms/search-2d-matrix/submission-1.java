class Solution {
    public static boolean kambhail(int [][]arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;

        int first=0;
        int last=(rows*cols)-1;

        while(first <= last){
            int mid=first+(last-first)/2;

            //simply mid ke bhalue in single dimension par nikalal ba  yekra ke ab hamni k index me todaem san 
            int row=mid/cols;
            int col=mid%cols;

            if(arr[row][col]==target) return true;
            if(arr[row][col]<target){
                first=mid+1;
            }
            if(arr[row][col]>target){
                last=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        return kambhail(matrix,target);
    }
}
