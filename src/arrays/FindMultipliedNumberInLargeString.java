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
        for(int i=num2.length()-1;i>=0;i--){
            k=resultLen-1-powerFactor;
            int currentI= num2.charAt(i)-'0';
            for(int j=num1.length()-1;j>=0;j--){
                int currentJ=num1.charAt(j)-'0';
                prod = (currentJ*currentI)+ carry+ result[k];
                result[k]=prod%10;
                carry=prod/10;
                k--;
            }
            if(carry>0){
                result[k]=carry;
            }
            carry=0;
            powerFactor++;
        }
        int k1=0;
        while(k1>=0 && result[k1]==0){
           k1++;
        }
        for(;k1<=resultLen-1;k1++){
            MultipliedString+=result[k1];
        }
        return MultipliedString;
    }

  
  public static void main(String[] args) {
	  
	  String MultipliedString =multiply("234643653434","234643653434");
      System.out.println("Multiplied result in String   : " + MultipliedString);
  }

}
