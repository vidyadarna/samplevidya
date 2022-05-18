package SecondAssignment;

import static SecondAssignment.DDMV.cart;

public class UserPayment {
    final int balance = 1000 ;
    void onlinePayment()
    {
        if(balance >= cart) {
            System.out.println("YOUR ORDER IS SUCCESSFULL");
            System.out.println("YOUR AVILIBLE BALANCE IS : " +balance);
        }
        else
            System.out.println("INSUFICENT BALANCE");

    }

}
