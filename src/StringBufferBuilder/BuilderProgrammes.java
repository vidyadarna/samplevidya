package StringBufferBuilder;

public class BuilderProgrammes {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Deeksha siree");
    //    sb1 = sb1 + "siree";
        sb1.append(" ");
        sb1.append("dharna");
        System.out.println("sb1 ="+ sb1.toString());
       // System.out.println(sb1.reverse());
        for (int i = 0; i<sb1.length(); i++){
            char ch = sb1.charAt(i);
            System.out.println("char at position :" + i + " " + ch);
        }
        System.out.println("capacity is "  + sb1.capacity());
        sb1.ensureCapacity(12);
        System.out.println("Capacity is :" + sb1.capacity());
        sb1.ensureCapacity(40);
        System.out.println("Capacity is : " + sb1.capacity());
        sb1.replace(1,6, "diksha");
        System.out.println("after replace  sb1 : " + sb1.replace(1,6,"diksha"));
       sb1 = sb1.delete(1,9);
        System.out.println("after deleting : " +sb1);
    }
}
