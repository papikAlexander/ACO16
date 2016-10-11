package week1.day1;

import java.util.Arrays;

/**
 * Created by Alexander on 09.10.2016.
 */
public class Group {
    private String name;
    private Student[] students;
    private int groupCount;


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

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                "}";
    }

    public boolean addStudent(Student student){
        if (student == null) return false;
        if (groupCount == students.length) return false;
        students[groupCount] = student;
        groupCount ++;

        return true;
    }

    public boolean deleteStudent(String names, String surnames){
        if (names == null || surnames == null) return false;
        for (int i = 0; i < groupCount; i++) {
            if (names.equals(students[i].getName()) && surnames.equals(students[i].getSurname())) {
                students[i] = null;
                System.arraycopy(students, i + 1, students, i, groupCount - i);
                /*students[i] = students[groupCount - 1];
                students[groupCount - 1] = null;*/
                groupCount--;
                return true;
            }
        }
        return false;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void findStudent(String name){
        if (name == null) {
            System.out.println("Please, enter name");
            return;
        }
        for (int i = 0; i < groupCount; i++) {
            if(name.equals(students[i].getName())) {
                System.out.printf("%s in this group", name);
                return;
            }
        }
        System.out.println("Don't find this student in this group");
    }
    public void sortStudentByName(){
        /*Student[] sortStudent = new Student[students.length];
        System.arraycopy(students, 0, sortStudent, 0, students.length - 1);
        sortStudent[0] = null;*/
        for (int i = 0; i < groupCount; i++) {
            for (int j = 0; j < groupCount - 1; j++) {
                if(students[j].getName().compareTo(students[j + 1].getName()) > 0){
                    Student tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;
                }
            }
        }
    }
}
