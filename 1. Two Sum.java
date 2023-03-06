class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i1=0;
        int i2=0;
        for(int i = 0; i < nums.length; i++){
            for(int k = 1; k < nums.length; k++){
                if(nums[i]+nums[k]==target && i != k){
                    i1 = k;
                    i2 = i;
                }
            }
        }
        int arr[] = new int[2];
        arr[1] = i1;
        arr[0] = i2; 
        return arr;
    }
}

