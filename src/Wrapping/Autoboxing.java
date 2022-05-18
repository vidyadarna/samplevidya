package Wrapping;

public class Autoboxing {
    int a =100;
    float f = 2.2f;
    byte b = 10;
    char c = 'v';
    long l = 122333444;
    short s = 333;
    boolean flag = true;
    double d = 2.22;

    public static void main(String[] args) {

        Integer a = 100;
    Integer integer = new Integer(a);

    float f =2.2f;
    Float aFloat =new Float(f);
    byte  b = 2;
    Byte aByte = new Byte(b);

    char c = 'v';
    Character character = new Character(c);

    long l = 1223333;
    Long aLong = new Long(l);

    short s = 333;
    Short aShort = new Short(s);


    boolean b1 = true;
    Boolean aBoolean = new Boolean(true);

    double d = 2.22;
    Double aDouble = new Double(d);
        System.out.println("print the values of wrapper objects ");
        System.out.println("Integer obj to int obj " +a);
        System.out.println("Float obj to  float " +f);
        System.out.println("Byte obj to byte obj "  +b);
        System.out.println("Character obj to char obj "  +c);
        System.out.println("Long obj to long obj " +l);
        System.out.println("Short obj to  short " +s);
        System.out.println("Boolean obj to boolean obj " +b1);
        System.out.println("Double obj to double obj " +d);


     Integer integer2 = new Integer(integer);
     Integer integer1 = 100;

        System.out.println("output is " +integer1);


}

}
