package arrays;

//https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;

public class FindProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int zeroFlagCount=0;
        boolean signFlag= false;
        boolean signFlagProduct = false;
        int product = 1;
        if(nums.length==2){
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1]=temp;
            return nums;
        }
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==0){
                zeroFlagCount++;
                continue;
            }
            product=product * nums[i];
        }
        for(int i=0;i<=nums.length-1;i++){
            if(zeroFlagCount == 1){
                if(nums[i]!=0){
                    nums[i]=0;
                    continue;
                } else {
                    nums[i]=product;
                    continue;
                }
            } else if(zeroFlagCount > 1){
                nums[i]=0;
            } else {
                nums[i]=product/nums[i];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array= new int[] {3,3,7,4,0,0,3,5};
        int[] productExceptSelfResult=productExceptSelf(array);

        System.out.println("Resultant array after multiplication : " +  Arrays.toString(productExceptSelfResult));
    }

}
