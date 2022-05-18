package CollegeApllication;

import BasicJavaProgramming.StudentApplication;

import java.util.ArrayList;
import java.util.List;

public class SetGetApllications {
    public static void main(String[] args) {


    StudentApplication student1=new StudentApplication();
        student1.setName("vaasu");
        student1.setMarks(78);
    student1.setRollno(10);
    student1.setSubject("english");

    StudentApplication student2=new StudentApplication();
    student2.setName("dinesh");
    student2.setMarks(68);
    student2.setRollno(23);
    student2.setSubject("telugu");

    StudentApplication student3=new StudentApplication();
    student3.setName("vamshi");
    student3.setMarks(89);
    student3.setRollno(22);
    student3.setSubject("maths");

    StudentApplication student4=new StudentApplication();
    student4.setName("teja");
    student4.setMarks(90);
    student4.setRollno(32);
    student4.setSubject("science");

        List<StudentApplication> obj=new ArrayList<>();
        obj.add(student1);
        obj.add(student2);
        obj.add(student3);
        obj.add(student4);
        for(int i=0;i< obj.size();i++)
        {
            System.out.println(obj.get(i).getName());
            System.out.println(obj.get(i).getMarks());
            System.out.println(obj.get(i).getRollno());
            System.out.println(obj.get(i).getSubject());
        }















}}
