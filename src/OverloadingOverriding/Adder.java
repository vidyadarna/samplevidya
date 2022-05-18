package OverloadingOverriding;
//Overloading
public class Adder {
    int Add(int a, int b) {
        return a + b;
    }

     float Add(float a, float b) {

        return a + b;
    }
    double Add(double a , double b){
        return a+b;

}

      public static void main(String[] args) {
        Adder adder = new Adder();
          System.out.println(adder.Add(12,23));
          System.out.println(adder.Add(2.2f,3.3f));
          System.out.println(adder.Add(2.2d,3.4d));


        }
    }

