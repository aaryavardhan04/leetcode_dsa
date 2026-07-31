class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,k=0;
        for(int m=0;m<nums.length;m++){
            if (nums[m]==0){
                i++;
            }
            else if(nums[m]==1){
                j++;
            }
            else{
                k++;
            }
        }
        // int z=0;
        for(int n=0;n<i;n++){
            nums[n]=0;
            // z++;
        }
        for(int n=i;n<i+j;n++){
            nums[n]=1;
            // z++;
        }
        for(int n=i+j;n<i+j+k;n++){
            nums[n]=2;
            // z++;
        }
    }
}