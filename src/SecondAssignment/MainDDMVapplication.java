package SecondAssignment;

import java.util.Scanner;

public class MainDDMVapplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("%%%%%%  DDMV SERVICES %%%%%%");
        DDMV ddmv = new DDMV();
        ddmv .displayOrder();
        ddmv.takingOrder();
        System.out.println("choose your payment : 1 is online : 2 is cash on delivery ");
        ddmv.displayOrder();
       UserPayment userPayment = new UserPayment();
        userPayment.onlinePayment();


    }
}
