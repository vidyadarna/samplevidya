package SecondAssignment;

import java.util.Scanner;

public class DDMV {
    static int cart;
    Scanner scanner = new Scanner(System.in);
    String[] nonveg = new String[]{"chicken biryani", "Fish biryani", "Mutton biryani", "Chicken65", "mutton65", "chicken manchurian"};
    int[] nonprize = new int[]{200, 300, 500, 125, 80, 125, 100};

    void displayOrder() {
        for (int i = 0; i < nonveg.length; i++) {
            System.out.println(i + 1 + " " + nonveg[i] + " = = " + nonprize[i]);
        }
    }

    void takingOrder() {
        int cart = 0;
        System.out.println("enter your order");

        for (int i = 0; i < 7; i++) {

            switch (scanner.nextInt()) {

                case 1:
                    System.out.println(nonveg[0]);
                    System.out.println(nonprize[0]);
                    cart += nonprize[0];
                    System.out.println(" your cart" + cart + "anything sir yes or no");
                    break;
                case 2:
                    System.out.println(nonveg[1]);
                    System.out.println(nonprize[1]);
                    cart += nonprize[1];
                    System.out.println(" your cart" + cart + "anything sir yes or no");
                    break;
                case 3:
                    System.out.println(nonveg[2]);
                    System.out.println(nonprize[2]);
                    cart += nonprize[2];
                    System.out.println(" your cart" + cart + "anything sir yes or no");
                    break;
                case 4:
                    System.out.println(nonveg[3]);
                    System.out.println(nonprize[3]);
                    cart += nonprize[3];
                    System.out.println(" your cart" + cart + "anything sir yes or no");
                    break;

                case 5:
                    System.out.println(nonveg[4]);
                    System.out.println(nonprize[4]);
                    cart += nonprize[4];
                    System.out.println(" your cart" + cart + "anything sir yes or no");
                    break;
                case 6:
                    System.out.println(nonveg[5]);
                    System.out.println(nonprize[5]);
                    cart += nonprize[5];
                    System.out.println(" your cart" + cart + "anything sir yes or no");
                    break;
                case 7:
                    System.out.println(nonveg[6]);
                    System.out.println(nonprize[6]);
                    cart += nonprize[6];
                    System.out.println(" your cart" + cart + "anything sir yes or no");
                    break;
                case 8:
                    System.out.println(nonveg[7]);
                    System.out.println(nonprize[7]);
                    cart = nonprize[7];
                    System.out.println(" your cart" + cart + "anything sir yes or no");
                    break;
                default:
                    System.out.println("please provide right order");

            }
            cart = cart;
            String ya = scanner.next();
            String y = "yes";
            String n = "no";

            if (ya.equals(y)) {
                System.out.println("enter order : ");
            }
                       else if (scanner.equals(n))
                    break;


            }
        }

    }




