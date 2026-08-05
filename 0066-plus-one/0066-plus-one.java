// class Solution {
//     public int[] plusOne(int[] digits) {
        
//         if (digits[digits.length-1]<9){
//             digits[digits.length-1]++;
//         }
//         else {
//             int i = digits.length -1;
//             while (digits[i]==9 ){
//                 digits[i]=0;
//                 i--;
//                 if(i<0){
//                     break;
//                 }
//             }
//             if(i==-1){
//                 int arr[]= new int[digits.length+1];
//                 arr[0]=1;
//                 return arr;
//             }
//             else{
//                 digits[i]++;
//             }
//         }
//         return digits;


        
//     }
// }

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}