package LoopsInJava;

public class MultiArray {
    public static void main(String[] args) {
        int [][] arr ={{ 1, 2},{2,2}} ;
        for(int i = 0; i < 2; i++){
            for(int j = 0;j<2; j++){
                System.out.print(arr [i][j] +" ");
            }
            System.out.println();
        }
    }
}
