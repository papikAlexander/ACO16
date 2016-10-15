package week1.homework.Interface.Task2;

/**
 * Created by Alexander on 15.10.2016.
 */
public class TestHospital {
    public static void main(String[] args) {
        Doctor doctor = new Surgeon("Nick", 200);
        Doctor doctor1 = new Neurosurgeon("Peter", 1000);

        doctor.work();
        doctor.salary();
        System.out.println(doctor);

        doctor1.work();
        doctor1.salary();
        System.out.println(doctor1);

    }
}
