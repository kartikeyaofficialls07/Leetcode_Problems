class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0 , max, n=nums.length ;
        for (int i = 0 ; i < k ; i++){
            sum = sum + nums [i];
        }
        max = sum ;
        for (int j = k ; j<n ; j++){
            sum = sum + nums[j];
            sum = sum - nums[j-k];
            // sum=sum+nums[j]-nums[j-k];//
            max= Math.max(max,sum);
        }
        return (double)max /k;      
    }
}