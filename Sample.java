// Time Complexity : O(n) where n is length of the array
// Space Complexity :
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int rob(int[] nums) {
      int len=nums.length;
          int sum= nums[0];
      for(int i=2;i<len;i+=2){
          sum=sum+nums[i];
      } 
        return sum;
    }
}
