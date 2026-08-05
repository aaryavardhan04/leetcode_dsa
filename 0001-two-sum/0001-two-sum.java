// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i< nums.length; i++){
//             for (int j = i+1; j < nums.length; j++){
//                 if(nums[i]+nums[j]== target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return null;
//     }
// }


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int c = 0;
//         for (int i = 0; i< nums.length; i++){
//             c = target - nums[i];
//             for (int j = i+1; j < nums.length; j++){
//                 if(nums[j]== c){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return null;
//     }
// }


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for (int i = 1; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 int t = j - i;
//                 if (nums[t] + nums[j] == target) {
//                     return new int[] { t, j };
//                 }
//             }
//         }
//         return new int[] {};
//     }
// }


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                // int t = j - i;
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}