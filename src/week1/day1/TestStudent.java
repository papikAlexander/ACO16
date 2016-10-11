package week1.day1;

/**
 * Created by Alexander on 08.10.2016.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Nick", "Smith", 25, 4.2);
        BudgetStudent student1 = new BudgetStudent("Sasha", "Smith", 20, 3.6, 4000);
        BudgetStudent student2 = new BudgetStudent("Sashka", "Smith", 21, 4, 4000);
        BudgetStudent student3 = new BudgetStudent("Misha", "Smith", 20, 4.6, 4000);
        ContractStudent student4 = new ContractStudent("Dima", "Ivanov", 21, 4.5, 5);
        Group group = new Group("ACO16", 10);
        Group group1 = new Group("ACO17", 10);
        University university = new University("Art Code", 5);
        university.addGroup(group);
        System.out.println(university);
        university.addGroup(group1);
        group.addStudent(student2);
        group.addStudent(student);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student1);
        //System.out.println(university);
        //university.deleteGroup("ACO17");
        System.out.println(group);
        group.deleteStudent("Misha", "Smith");
        System.out.println(group);
       // System.out.println(university);
        /*group.findStudent(null);
        System.out.println(group);
        group.sortStudentByName();
        System.out.println(group);*/
    }
}
