class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> miss = new ArrayList<Integer>();

        Arrays.sort(nums);

        // for (int i =1; i < nums.length; i++){
        //     if(nums[i-1]+1!=nums[i]){
        //         miss.add(nums[i]-1);
        //     }
        // }
        // return miss;

        for (int i =1; i < nums.length; i++){
            if(nums[i-1] + 1!= nums[i]){
            int range = nums[i]-nums[i-1];
            int copy = nums[i-1];
            for (int j=0; j <range-1;j++){
                miss.add(copy+1);
                copy++;
            }
            }
        }
        return miss;


    }
}