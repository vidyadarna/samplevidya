package StringCocepts;

public class StringIntern {
    public static void main(String[] args) {
        String str1 = new String("java");
        String str2 = new String("java");
        str1=str1.intern();
        str2=str2.intern();
        System.out.println(str1==str2);
    }
}
