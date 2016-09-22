public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)
            return lists;
        Arrays.sort(nums);
        
        for(int i = 0; i<=nums.length-2; i++){
            if(i == 0||nums[i] > nums[i-1]){
                int j = i+1;
                int k=nums.length-1;
                
                while(j<k){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        lists.add(list);
                        j++;
                        k--;
     
                        //handle duplicate here
                        while(j<k && nums[j]==nums[j-1])
                            j++;
                        while(j<k && nums[k]==nums[k+1])
                            k--;
                    } else if(sum < 0){
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
    
        return lists;
    }
}