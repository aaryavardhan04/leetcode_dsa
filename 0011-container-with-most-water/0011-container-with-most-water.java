class Solution {
    public int maxArea(int[] height) {
        
        
        int left = 0;
        int right = height.length-1;

        int breadth = height.length-1;
        // int height = height[0];
        int max_vol = 0;


        while(left<right){
            if(height[left]>height[right]){
                if(max_vol< (right-left)*height[right]){
                    max_vol= (right-left)*height[right];
                }
                right--;    
            }
            else if(height[left]<=height[right]){
                if(max_vol< (right-left)*height[left]){
                    max_vol= (right-left)*height[left];
                }
                left++;
            }
            breadth--;
        }
        return max_vol;

    }
}