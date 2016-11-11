package week1.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Alexander on 08.10.2016.
 */
public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("Nick", "Smith", 25, 4.2);
        BudgetStudent student1 = new BudgetStudent("Nick", "Smith", 20, 3.6, 4000);
        BudgetStudent student2 = new BudgetStudent("Sashka", "Smith", 21, 4, 4000);
        BudgetStudent student3 = new BudgetStudent("Misha", "Smith", 20, 4.6, 4000);
        ContractStudent student4 = new ContractStudent("Dima", "Ivanov", 21, 4.5, 5);
        Student student5 = new Student("Nicka", "Smith", 25, 4.2);
        Group group = new Group("ACO16", 5);
        Group group1 = new Group("ACO17", 10);
        University university = new University("Art Code", 5);
        group.addStudent(null);
        System.out.println(group);

       // university.addGroup(group);
        //System.out.println(university);
       // university.addGroup(group1);
     //   System.out.println(university);
       // System.out.println(university);
        //university.addGroup(group1);
        group.addStudent(student2);
        group.addStudent(student);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student1);
       // System.out.println(group);
       // group.addStudent(student5);
      //  group.sort();
       // System.out.println(group);
        //System.out.println(university);
        //university.deleteGroup("ACO17");
       // System.out.println(group);
       // group.deleteStudent("Misha", "Smith");
      //  System.out.println(group);
       // System.out.println(university);
       // group.findStudent(null);
       // System.out.println(group);
      //  group.sortStudentByName();
       // System.out.println(group);
        university.addGroup(group);
        System.out.println(university);
        University clone = university.clone();
        System.out.println(clone);

    }
}
