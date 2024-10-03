class Solution {
    public int singleNumber(int[] nums) {

        int n = nums.length;
        int finalResult = 0;

        for (int i=0;i<n;i++){
           finalResult = finalResult ^ nums[i];
        }
        return finalResult;
    }
}