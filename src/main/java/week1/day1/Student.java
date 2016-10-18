package week1.day1;

/**
 * Created by Alexander on 08.10.2016.
 */
public class Student implements Comparable{

    private String name;
    private String surname;
    private int age;
    private double averageMark;

    public Student(String name, String surname, int age, double averageMark){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || !(o instanceof Student)) return false;
        Student tmp = (Student)o;
        return tmp.name.equals(this.name)&& this.surname.equals(tmp.surname);
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(this == o) return 0;
        if(o != null && (o instanceof Student)){
            Student tmp = (Student) o;
            return this.name.compareTo(tmp.name);
        }
        return -1;
    }
}

