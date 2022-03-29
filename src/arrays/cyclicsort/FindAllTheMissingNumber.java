package arrays.cyclicsort;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindAllTheMissingNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dispNum = new ArrayList<>();
        if(nums.length==1){
            return dispNum;
        }
        int i=0;
        while(i<nums.length){
            //First 2 conditions might not be required based on given question
            if(nums[i]!=i+1 && nums[i]<=nums.length && nums[nums[i]-1]!=nums[i]){
                swap(nums,i,nums[i]-1);
            }
            else {
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                dispNum.add(j+1);
            }
        }
        return dispNum;
    }

    public static void swap(int[] nums, int i, int j){
        if(i==j){
            return;
        }
        nums[i] = nums[i]+nums[j];
        nums[j] = nums[i]-nums[j];
        nums[i] = nums[i]-nums[j];
    }
  
  public static void main(String[] args) {
	  
	  int[] array= new int[] {4,3,2,7,8,2,3,1,9,9,9,7,10,12,16,78,87};
	  List<Integer> missingNum=findDisappearedNumbers(array);
      System.out.println("Missing Number is : " + missingNum.toString());
  }

}
