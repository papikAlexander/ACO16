package week1.day1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Alexander on 11.11.2016.
 */
public class TestClone {

    Student student;
    BudgetStudent student1;
    ContractStudent student2;
    Group group;
    University university;
    University clone;

    @After
    public void print(){
        System.out.println(clone);
        System.out.println(university);
        System.out.println();
    }
    @Before
    public void init() throws CloneNotSupportedException {

        student = new Student("Nick", "Smith", 25, 4.2);
        student1 = new BudgetStudent("Nick", "Smith", 20, 3.6, 4000);
        student2 = new ContractStudent("Dima", "Ivanov", 21, 4.5, 5);
        group = new Group("ACO16", 5);
        university = new University("Art Code", 5);

        university.addGroup(group);
        group.addStudent(student);
        group.addStudent(student1);
        group.addStudent(student2);

        clone = university.clone();


    }

    @Test
    public void testCloneUniversity(){
        clone.setName("Java Rush");
        Assert.assertEquals("Java Rush", clone.getName());
        Assert.assertEquals("Art Code", university.getName());
        System.out.println("University clone result");
    }

    @Test
    public void testCloneGroup(){
        clone.getGroups()[0].setName("ACO10");
        Assert.assertEquals("ACO10", clone.getGroups()[0].getName());
        Assert.assertEquals("ACO16", university.getGroups()[0].getName());
        System.out.println("Group clone result");
    }

    @Test
    public void testCloneStudent(){
        clone.getGroups()[0].getStudents()[0].setName("Alex");
        Assert.assertEquals("Alex", clone.getGroups()[0].getStudents()[0].getName());
        Assert.assertEquals("Nick", university.getGroups()[0].getStudents()[0].getName());
        System.out.println("Student clone result");
    }
}
