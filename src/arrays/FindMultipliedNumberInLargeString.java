package arrays;

//https://leetcode.com/problems/multiply-strings/

public class FindMultipliedNumberInLargeString {
    public static String multiply(String num1, String num2) {
        String MultipliedString="";
        if(num1.charAt(0)=='0' || num2.charAt(0)=='0'){
            MultipliedString="0";
            return MultipliedString;
        }
        int resultLen = num1.length() + num2.length();
        int[] result = new int[resultLen];
        int powerFactor=0, carry=0, prod=0;
        int k=0;
        for(int i=num2.length()-1;i<0;i++){
            k=
        }
        return MultipliedString;
    }

  
  public static void main(String[] args) {
	  
	  String MultipliedString =multiply("2147483","0");
      System.out.println("Multiplied result in String   : " + MultipliedString);
  }

}
