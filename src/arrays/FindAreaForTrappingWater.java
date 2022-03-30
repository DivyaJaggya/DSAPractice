package arrays;

public class FindAreaForTrappingWater {
    public static int trap(int[] height) {
        int unitofWtater=0;
        if(height.length<3){
            return unitofWtater;
        }
        int i=0, j=height.length-1;
        int left_max=0, right_max=0, result=0;
        while(i<j){
            if(height[i]<height[j]){
                if(height[i]>left_max){
                    left_max=height[i];
                } else {
                    unitofWtater+=left_max - height[i];
                }
                i++;
            } else {
                if(height[j]>right_max){
                    right_max=height[j];
                } else {
                    unitofWtater+=right_max - height[j];
                }
                j--;
            }
        }
        return unitofWtater;
    }

    public static void main(String[] args) {
        int[] array= new int[] {3,3,7,4,6,0,3,5};
        int maxWaterHoldingUnit=trap(array);
        System.out.println("Max Rain water that can be occupied is : " + maxWaterHoldingUnit);
    }
}
