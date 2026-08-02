class Solution {
    public int majorityElement(int[] nums) {


        // M1 - SORT ARRAY MANUALLY - INSERTION SORT 

        // int temp=0;
        // for (int j=0; j<nums.length;j++){
        //     temp=nums[j];
        //     int i = j-1;
        //     while(i>=0 && nums[i]>temp){
        //         nums[i+1]=nums[i];
        //         i=i-1;
        //     }
        //     nums[i+1]=temp;
        // }
        // return nums[nums.length/2];


        //M2 - SORT ARRAY USING LIBRARY 


        // Arrays.sort(nums);
        // return nums[nums.length / 2];



        //M3 - BRUTE FORCE FOR COUNTING - TLE IN HIDDEN TEST CASE (MY LOGIC EXPCETED SHIT)

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

        //M4 - GPT GURUDEV - Boyer-Moore Voting Algorithm

        int candidate = 0;
        int count = 0;

        for(int i =0 ; i < nums.length; i++){
            if(count==0){
                candidate=nums[i];
                count=1;
            }
            else if (nums[i]!=candidate){
                count--;
            }
            else{
                count++;
            }
        }
        return candidate;
    }
}