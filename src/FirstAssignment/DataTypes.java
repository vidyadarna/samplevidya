package FirstAssignment;

public class DataTypes {
    public static void main(String[] args) {
        char ch1 = 'v'; char ch2 = 's';
        byte b1 = 2; byte b2 = 3;
        short s1 = 400; short s2 = 500;
        float f1 = 233.333f; float f2 =333.444f;
        int i1 = 1000; int i2 = 2000;
        double d1 = 22; double d2 = 33;
        long l1 = 19999999; long l2 =45555555;

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(l1);
        System.out.println(l2);

        System.out.println("Before swap");

        System.out.println("i1 = " +i1);
        System.out.println("s1 = " +s1);
        System.out.println("f1 = " +f1);
        System.out.println("l1 =" +l1);
        System.out.println("d1 = " +d1);
        System.out.println("b1 = " +b1);
        System.out.println("ch1 = " +ch1);
        System.out.println("i2 =" +i2);
        System.out.println("s2 = " +s2);
        System.out.println("f2 = " +f2);
        System.out.println("l2 = " +l2);
        System.out.println("d2 = " +d2);
        System.out.println("b2 = " +b2);
        System.out.println("ch2 = " +ch2);

        int temp1 = i1;
        i1 = i2;
         i2 = temp1;

        short temp2 = s1 ;
        s1 =s2;
        s2 = temp2;

      float  temp3 = f1;
      f1 = f2 ;
      f2 = temp3;

      long temp4 = l1;
      l1 = l2;
      l2 = temp4;

      double temp5 = d1;
      d1 = d2;
      d2 = temp5;

      byte temp6 = b1;
      b1 =b2;
      b2 = temp6;

      char temp7 = ch1;
      ch1 =ch2;
      ch2 = temp7;

        System.out.println("after swap");

        System.out.println("i1 = " +i1);
        System.out.println("s1 = " +s1);
        System.out.println("f1 = " +f1);
        System.out.println("l1 =" +l1);
        System.out.println("d1 = " +d1);
        System.out.println("b1 = " +b1);
        System.out.println("ch1 = " +ch1);

        System.out.println("i2 = " +i2);
        System.out.println("s2 = " +s2);
        System.out.println("f2 = " +f2);
        System.out.println("l2 = " +l2);
        System.out.println("d2 = " +d2);
        System.out.println("b2 = " +b2);
        System.out.println("ch2 = " +ch2);
    }
}
