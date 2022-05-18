package Wrapping;

public class UnBoxing {
    Integer i = 111;
    Float f =  22.22f;
    Double d = 22.22;
    Character c = 'b';

    public static void main(String[] args) {
        Integer i = 111;
        Integer integer = new Integer(i);

        Float f =  22.22f;
        Float float2 = new Float(f);

        Double d = 22.22;
        Double double2 = new Double(d);

        Character c = 'b';
        Character character = new Character(c);
        System.out.println("integer value " + i);
        System.out.println("float value " + f);
        System.out.println("double value " + d);
        System.out.println("chr value " + c);
    }
}
