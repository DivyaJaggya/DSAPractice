package arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class Find2SumWhenArraySorted {
    public static int[] twoSum(int[] numbers, int target) {

        //Please note that array is sorted here already and elements are non repeating

        int[] sumNum = new int[2];
        int i=0,j=numbers.length-1;
        while(i!=j){
            if(i!=0 && numbers[i]==numbers[i-1]){
                i++;
                continue;
            }
            if(numbers[i]+numbers[j]>target){
                j--;
            } else if(numbers[i]+numbers[j]<target){
                i++;
            } else if(numbers[i]+numbers[j]==target){
                sumNum[0]=i+1;
                sumNum[1]=j+1;
                return sumNum;
            } else{
                sumNum=null;
            }
        }
        return sumNum;
    }

    public static void main(String[] args) {
        int[] array= new int[] {3,3,7,4,6,0,3,5};
        int[] twoSumNum=twoSum(array,5);
        System.out.println("Two Sum Numbers are at place : " + twoSumNum[0] + " " + twoSumNum[1]);
    }
}
