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
            int copy = nums[i-1]+1 ;
            while(copy <nums[i]){
                miss.add(copy);
                copy++;
            }
            }
        }
        return miss;


    }
}
