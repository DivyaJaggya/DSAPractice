package arrays;

//https://leetcode.com/problems/plus-one/

import java.util.Arrays;

import static arrays.FindDuplicateNumber.duplicateNumber;

public class FindPlusOne {
    public static int[] plusOne(int[] digits) {
        if(digits.length==0)
            return digits;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newDigit = new int[digits.length + 1];
        newDigit[0]=1;
        return newDigit;
    }
  
  public static void main(String[] args) {
	  
	  int[] array= new int[] {9,9,9,9,9,9,9,9,9,9,8};
	  int[] plusOneArray=plusOne(array);
      System.out.println("Plus One array is  : " + Arrays.toString(plusOneArray));
  }

}
