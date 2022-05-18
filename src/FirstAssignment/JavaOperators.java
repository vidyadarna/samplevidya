package FirstAssignment;

import java.util.Scanner;

public class JavaOperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int d = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("enter your operator");

         char h=input.next().charAt(0);

        switch (h) {
            case '+':
                d = a + b;
                System.out.println(a + "+" + b+ " = " +d);
                break;

            case '-':
                d = a-b;
                System.out.println(a + "-" + b + " = " +d);
                break;
            case '*':
                d = a * b;
                System.out.println(a + " * " + b + " = " +d);
                break;
            case '/':
                d = a/b;
                System.out.println(a+ " / " + b + " = "+d);

            case '%' :
                d = a % b;
                System.out.println(a+ " % " + b + " = " +d);


            default:
                System.out.println();
        }


    }

}