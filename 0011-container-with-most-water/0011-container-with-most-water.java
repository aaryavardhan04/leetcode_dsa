class Solution {
    public int maxArea(int[] height) {
        
        
        int left = 0;
        int right = height.length-1;
        int max_vol = 0;


        while(left<right){
            if(height[left]>height[right]){
                if(max_vol< (right-left)*height[right]){
                    max_vol= (right-left)*height[right];
                }
                right--;    
            }
            else {
                if(max_vol< (right-left)*height[left]){
                    max_vol= (right-left)*height[left];
                }
                left++;
            }
        }
        System.gc();
        return max_vol;

    }
}