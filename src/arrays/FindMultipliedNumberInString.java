package arrays;

//https://leetcode.com/problems/multiply-strings/

public class FindMultipliedNumberInString {
    public static String multiply(String num1, String num2) {
        int number1=0;
        int number2=0;
        if(num1.length()==1){
            number1=num1.charAt(0) - '0';
        } else {
            for(int i=0; i<num1.length(); i++ ){
                if( Integer.MAX_VALUE/10>number1 || (Integer.MAX_VALUE/10==number1 && Integer.MAX_VALUE % 10> num1.charAt(i) - '0'))
                    number1 = (10 * number1) + (num1.charAt(i) - '0');
                else
                    number1=Integer.MAX_VALUE;
            }
        }
        if(num2.length()==1){
            number2=num2.charAt(0) - '0';
        } else {
            for(int j=0;j<num2.length();j++){
                if(Integer.MAX_VALUE/10>number2 || (Integer.MAX_VALUE/10==number2 && Integer.MAX_VALUE % 10>num1.charAt(j) - '0'))
                    number2 = (10 * number2) + (num2.charAt(j) - '0');
                else
                    number2=Integer.MAX_VALUE;
            }
        }
        int MultipliedNum=0;
        if(number1==0 || number2==0){
            MultipliedNum=0;
        }else if(number1==Integer.MAX_VALUE || number2==Integer.MAX_VALUE || (number1>0 && number1>=Integer.MAX_VALUE/number2) || (number2>0 && number2>=Integer.MAX_VALUE/number1)){
            MultipliedNum=Integer.MAX_VALUE;
        }else {
             MultipliedNum=number1*number2;
        }
        String MultipliedString ="";
        if(MultipliedNum==0)
            MultipliedString="0";
        while(MultipliedNum!=0){
           MultipliedString = MultipliedNum % 10 + MultipliedString;
            MultipliedNum/=10;
        }
        return MultipliedString;
    }
  
  public static void main(String[] args) {
	  
	  String MultipliedString =multiply("2147483","0");
      System.out.println("Multiplied result in String   : " + MultipliedString);
  }

}
