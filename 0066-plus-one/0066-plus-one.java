class Solution {
    public int[] plusOne(int[] digits) {
        
        if (digits[digits.length-1]<9){
            digits[digits.length-1]++;
        }
        else {
            int i = digits.length -1;
            while (digits[i]==9 ){
                digits[i]=0;
                i--;
                if(i<0){
                    break;
                }
            }
            if(i==-1){
                int arr[]= new int[digits.length+1];
                arr[0]=1;
                return arr;
            }
            else{
                digits[i]++;
            }
        }
        return digits;
    }
}