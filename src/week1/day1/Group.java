package week1.day1;

import java.util.Arrays;

/**
 * Created by Alexander on 09.10.2016.
 */
public class Group {
    private String name;
    private Student[] students;
    private int studentCount;


    public Group(String name, int groupSize) {
        this.name = name;
        this.students = new Student[groupSize];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                "}";
    }

    public boolean addStudent(Student student){
        if (student == null || studentCount == students.length) return false;
        students[studentCount++] = student;
        return true;
    }

    public boolean deleteStudent(String name, String surname){
        if (name == null || surname == null) return false;
        for (int i = 0; i < studentCount; i++) {
            if (name.equals(students[i].getName()) && surname.equals(students[i].getSurname())) {
                System.arraycopy(students, i + 1, students, i, studentCount - i - 1);
                students[--studentCount] = null;
                return true;
            }
        }
        return false;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void findStudent(String name){
        if (name == null) {
            System.out.println("Please, enter name");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            if(name.equals(students[i].getName())) {
                System.out.printf("%s in this group", name);
                return;
            }
        }
        System.out.println("Don't find this student in this group");
    }
    public void sortStudentByName(){
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < studentCount - 1; j++) {
                if(students[j].getName().compareTo(students[j + 1].getName()) > 0){
                    Student tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;
                }
            }
        }
    }
}
