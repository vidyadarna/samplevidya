package BasicJavaProgramming;

public class LogicalOperators {
    public static void main(String[] args) {
        int a=10,b=2,c=10,d=0;
        System.out.println("X1="+a);
        System.out.println("X2="+b);
        System.out.println("X3="+c);
        if(a>b||a==b){
            d=a+b+c;
        }
        System.out.println("the condition is true d=" +d);

    }
}
