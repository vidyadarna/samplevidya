package OopsConcept;

class Dog extends Sound
{

    String colour = "black";

    @Override
    void animal() {
        System.out.println("dog");

    }

    @Override
    String colour() {

        return colour;
    }
    void sound (){
        System.out.println("bouh");
    }

    @Override
    void food() {
        System.out.println("pediasure");
    }
}
