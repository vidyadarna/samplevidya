package BasicJavaProgramming;

public class Array {
    public static void main(String[] args) {
        int[]arr;
        arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        int sum=0,i;
        for(i=0;i<arr.length;i++)
            sum+=arr[i];
            System.out.println("sum of array values:"+sum);
        }


    }

