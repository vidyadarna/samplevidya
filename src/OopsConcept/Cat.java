package OopsConcept;

public class Cat extends Sound {
    String colour = "white";
    @Override
    void animal() {
        System.out.println("cat");

    }

    @Override
    String colour() {
       return colour;

    }
    void sound (){
        System.out.println("maww");
    }

    @Override
    void food() {
        System.out.println("milk");
    }
}
