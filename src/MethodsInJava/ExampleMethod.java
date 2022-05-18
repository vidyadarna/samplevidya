package MethodsInJava;

class main{
    //create a method
    public int addNumbers( int  a,int b ) {
        int sum = a + b;
        //return value
        return sum;
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 22;
        main obj = new main();
        int result = obj.addNumbers(a , b);
        System.out.println("sum is " +result);

    }
}


