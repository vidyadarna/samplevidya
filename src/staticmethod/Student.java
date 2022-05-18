package staticmethod;

public class   Student {
   static   int StudentId;
   static   String name;
  static    String qulification;
  static    String collegeName = "vaagdevi";

    static void change() {collegeName = " vaagdevi" ;}

    Student(int s1, String n, String s2, String s3) {
        s1 = StudentId;
        s2 = qulification;
        n = name;
        s3 = collegeName;
    }
   void display() {
        System.out.println(StudentId + " " +"name"+   " "  +qulification + " "+ collegeName );
    }
    public static class TestStaticMethod{
        public static void main(String[] args) {
            int s1 = 222;
            System.out.println("Student id is : " +s1);
            String n = " vidya";
            System.out.println("student name is : " +n);
            String s2 = " btech";
            System.out.println("qulification is : "  +s2);
            String s3 = "vaagdevi";
            System.out.println("collegename is : " + s3);
        }


    }


}
