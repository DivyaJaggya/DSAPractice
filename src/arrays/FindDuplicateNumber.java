package arrays;

//https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicateNumber {
	 public static int duplicateNumber(int[] nums) {
         for(int i=0;i<nums.length;i++){
             while(nums[i]<=nums.length && nums[nums[i]-1]!=nums[i]){
                 //swap the numbers
                 swap(nums, i, nums[i]-1);
             }
         }
         for(int i=0;i<nums.length;i++){
             if(nums[i]!=i+1 && nums[nums[i]-1]==nums[i]){
                 return nums[i];
             }
         }
         return 0;
     }
  public static void swap(int[]nums, int i, int j){
      if(i==j){
          return;
      }
      /*nums[i] = nums[i]^nums[j];
      nums[j] = nums[i]^nums[j];
      nums[i] = nums[i]^nums[j];*/
      nums[i] = nums[i]+nums[j];
      nums[j] = nums[i]-nums[j];
      nums[i] = nums[i]-nums[j];
  }
  
  public static void main(String[] args) {
	  
	  int[] array= new int[] {4,2,3,1,4};
	  int duplicateNum=duplicateNumber(array);
      System.out.println("Duplicate Number is : " + duplicateNum);
  }

}
