package Keywords;

public class Student {
    int rollno ;
    String name;
    float result;
       Student(int rollno,String name ,int result){
           this.name = name;
           this .result =result;
           this.rollno = rollno;
       }

    void print(){
        String newline = System.lineSeparator();
        System.out.println(rollno+newline+name+newline+result) ;

    }

    public static void main(String[] args) {
        Student s1 = new Student(11,"vaasu",900);
        Student s2 = new Student(22,"vidya",900);
        s1.print();
        s2.print();
    }
}
