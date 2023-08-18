#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

public class Calculator {
    public void multiply(int num1, int num2){
        int multnum = num1 * num2;
        System.out.println("The multiplication of " + num1+ " and "+ num2+ " is "+ multnum);
    }
    public void addition(int num1, int num2){
        int addnum = num1 + num2;
        System.out.println("The addition of "+ num1+ " and "+ num2+ " is "+ addnum);
    }
    public void substraction(int num1, int num2){
        int subnum = num1 - num2;
        System.out.println("The substraction of "+ num2+ " from "+ num1+ " is "+ subnum);
    }
    public void division (int num1, int num2){
        int divnum = num1 / num2;
        System.out.println("The division of "+ num1+ " by "+ num2+ " is "+ divnum);
    }
}
