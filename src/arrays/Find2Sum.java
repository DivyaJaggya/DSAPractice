package arrays;

//https://leetcode.com/problems/two-sum/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Find2Sum {
    public static int[] twoSum(int[] nums, int target) {

        int[] sumNum = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
/*

    //Discrading this because the [3,3] case doesnt works
        for(int i=0; i<nums.length-1; i++)
            map.put(nums[i],i);

        //This line is the problem as we dont expect to loose the relative position.
        Arrays.sort(nums);

        int i=0,j=nums.length-1;
        while(i!=j){
            if(i!=0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            if(nums[i]+nums[j]>target){
                j--;
                continue;
            } else if(nums[i]+nums[j]<target){
                i++;
                continue;
            } else if(nums[i]+nums[j]==target){
                sumNum[0]=map.get(nums[i]);
                sumNum[1]=map.get(nums[j]);
                return sumNum;
            } else{
                sumNum=null;
            }
        }*/
        // num[i] + requiredNum = target --> requiredNum = target-num[i]

        for(int i=0;i<nums.length;i++){
            int requiredNum = target-nums[i];
            if(map.containsKey(requiredNum)){
                sumNum[1]=i;
                sumNum[0]=map.get(requiredNum);
                break;
            }
            map.put(nums[i],i);
        }
        return sumNum;
    }

    public static void main(String[] args) {
        int[] array= new int[] {3,3,7,4,6,0,3,5};
        int[] twoSumNum=twoSum(array,5);
        System.out.println("Two Sum Numbers are at place : " + twoSumNum[0] + " " + twoSumNum[1]);
    }
}
