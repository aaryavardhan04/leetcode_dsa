class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i =m,j=0; i < m+n; i++,j++){ //adding nums2 to nums1
            nums1[i]=nums2[j];
        }

        // now we have to sort numbers from nums1[m] and after that 
    
        int temp=0;
        for (int j=m; j<m+n;j++){
            temp=nums1[j];
            int i = j-1;
            while(i>=0 && nums1[i]>temp){
                nums1[i+1]=nums1[i];
                i=i-1;
            }
            nums1[i+1]=temp;
            // for (int i=j-1;i>=0;i--){
            //     if(nums1[i]>temp){
            //         nums1[i+1]=nums1[i];
            //     }
            //     else{
            //         nums1[i+1]=temp;
            //         break;
            //     }
            // }
        }
    }
}