package BasicJavaProgramming;

public class Continue {
    public static void main(String[] args) {
        int a=0,b=3;
        for(a=0;a<=20;a++){
            if(a == 3 || a==5) {
                continue;
            }
                System.out.println(b+"*"+a+"="+a*b);

            }
        }
    }

