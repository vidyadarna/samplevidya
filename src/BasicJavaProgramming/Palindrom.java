package BasicJavaProgramming;

public class Palindrom {
    public static void main(String[] args) {
        int a, sum = 0, temp, n = 454;
        a = n % 10;
        temp=n;
        while (n > 0) {
            sum = (sum * 10) + a;
            n=n/10;
        }
        if (temp == sum) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not palindrome");
        }

    }
}
