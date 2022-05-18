package FirstAssignment;

public class MaxArray {
    public static void main(String[] args) {
        int[ ] intArray = {20,300,40,50} ;
        int maxNum = intArray[0] ;
        for( int i : intArray) {
            if( i > maxNum)
            maxNum = i;
        }
            System.out.println(" maxNum equals to  "  +maxNum );

    }
}
