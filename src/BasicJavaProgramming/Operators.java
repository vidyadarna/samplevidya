package BasicJavaProgramming;

public class Operators {

    public static void main(String[]args){
        int num1=12;
        int num2=23,sum;
        System.out.println(num1+num2);
        System.out.println(num2-num1);
        System.out.println(num1*num2);
        System.out.println(num2/num1);
        System.out.println(num2%num1);
        num1=-num1;
        System.out.println(num1);
        System.out.println(num1==num2);
        System.out.println(num2>num1);
        System.out.println(num1>0 && num1<0);
        System.out.println(num1==0 || num2!=0);
        System.out.println(num1>num2);
        sum=(num1>num2)?(num1+num2):(num1-num2);
        System.out.println(sum);






    }

}
