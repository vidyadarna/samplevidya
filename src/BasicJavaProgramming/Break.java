package BasicJavaProgramming;

public class Break {
    public static void main(String[] args) {
        int a = 1, b = 12,sum;
        for (a = 1; a <= 20; a++){
            sum=a+b;
            if (a == 6) {
                break;
            }
            System.out.println(a+"+"+b+"="+ sum);

        }

    }
}