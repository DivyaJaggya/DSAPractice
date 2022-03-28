package arrays;

//https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalResult = new ArrayList<>();
        if(nums.length<3){
            return finalResult;
        }
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int val1 = nums[i];
            //Since we know val1 + val2 + val3 == 0 --> val2 + val3 =0 - val1 --> Hence -val1
            int valSumRequired = -(val1);
            List<List<Integer>> sumArray = new ArrayList<>();
            sumArray = twoSum(nums, valSumRequired, i+1, nums.length-1);
            for(List<Integer> list: sumArray){
                list.add(val1);
                finalResult.add(list);
            }
        }

        return finalResult;
    }

    public static List<List<Integer>> twoSum(int[] nums, int target, int start, int end) {
        List<List<Integer>> twoSum = new ArrayList<>();
        if(end-start<1){
            return twoSum;
        }
        int i=start,j=end;
        while(i!=j && i<j){
            if(i!=start && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            if(nums[i]+nums[j]==target){
                List<Integer> sumNum = new ArrayList<>(2);
                sumNum.add(nums[i]);
                sumNum.add(nums[j]);
                twoSum.add(sumNum);
                i++;
                j--;
            }  else if(nums[i]+nums[j]>target){
                j--;
            } else {
                i++;
            }
        }
        return twoSum;
    }

    public static void main(String[] args) {
        int[] array= new int[] {-1,0,1};
        List<List<Integer>> threeSumNum=threeSum(array);
        for(List<Integer> list: threeSumNum){
            System.out.println("pair generated : " + list.toString());
        }

    }
}
