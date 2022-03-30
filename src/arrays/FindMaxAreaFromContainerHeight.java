package arrays;

//https://leetcode.com/problems/container-with-most-water/

public class FindMaxAreaFromContainerHeight {
    public static int maxArea(int[] height) {
        int maxArea=0;
        if(height.length==2){
            maxArea=Math.min(height[0], height[1]);
            return maxArea;
        }
        int i=0,j=height.length-1;
        while(i<j){
            int result = Math.min(height[i], height[j])*(j-i);
            if(result>maxArea){
                maxArea=result;
            }
            if(height[i]>height[j]){
                j--;
                if(height[j]<height[j+1]){
                    j--;
                }
            } else if(height[i]<height[j]){
                i++;
                if(height[i]<height[i-1]){
                    i++;
                }
            } else{
                i++;
            }
        }
        return maxArea;

        //Best solution could have been
        /*
        *  public static int maxArea(int[] height) {
        int max = 0;
        int temp = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            if (height[i] <= height[j]) {
                temp = height[i] * (j - i);
                i++;
            } else {
                temp = height[j] * (j - i);
                j--;
            }
            if (temp > max) max = temp;
        }
        return max;
    }*/
    }

    public static void main(String[] args) {
        int[] array= new int[] {3,3,7,4,6,0,3,5};
        int maxArea=maxArea(array);
        System.out.println("Max area a container can occupy is : " + maxArea);
    }
}
