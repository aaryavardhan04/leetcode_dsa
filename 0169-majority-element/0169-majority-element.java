class Solution {
    public int majorityElement(int[] nums) {

        int temp=0;
        for (int j=0; j<nums.length;j++){
            temp=nums[j];
            int i = j-1;
            while(i>=0 && nums[i]>temp){
                nums[i+1]=nums[i];
                i=i-1;
            }
            nums[i+1]=temp;
        }
        return nums[nums.length/2];





        // for(int i =0 ; i <nums.length;i++){
        //     int x=0;
        //     for (int j =0; j<nums.length;j++){
                
        //         if(nums[i]==nums[j]){
        //             x++;
        //         }
        //         if(x>nums.length/2){
        //             return nums[i];
        //         }
        //     }
        // }
        // return nums[1];
    }
}