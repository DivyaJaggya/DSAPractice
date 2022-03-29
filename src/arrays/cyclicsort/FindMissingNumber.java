package arrays.cyclicsort;

//https://leetcode.com/problems/missing-number/

public class FindMissingNumber {
	 public static int missingNumber(int[] nums) {
         for(int i=0;i<nums.length;i++){
                 while(nums[i]<nums.length && nums[i]!=i){
                  //Swap the numbers 
                swap(nums, i, nums[i]);
                }
         }
      for(int j=0;j<nums.length;j++){
          if(nums[j]!=j){
              return j;
      }     
  } 
   return nums.length;
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
	  
	  int[] array= new int[] {9,6,4,2,3,5,7,0,1};
	  int missingNum=missingNumber(array);
      System.out.println("Missing Number is : " + missingNum);
  }

}
