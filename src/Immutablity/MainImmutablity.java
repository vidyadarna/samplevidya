package Immutablity;

public class MainImmutablity {

    public static void main(String[] args) {
        ExampleOfImmutable coustmer = new ExampleOfImmutable(9531234444l,"vidya",22.34f,"vidya123");
        System.out.println(coustmer.getNumber());
        System.out.println(coustmer.getBalance());
        System.out.println(coustmer.getName());
        System.out.println(coustmer.getPassword());

        }
    }



