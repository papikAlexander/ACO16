package week5.day1.exeptions;

/**
 * Created by Alexander on 05.11.2016.
 */
public class TestExceptions {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try");
            loop();
            loop2();

        } catch (MyExceptions | MySecondException e){
            System.out.println("Inside catch");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally");
        }
    }

    private static void loop() throws MyExceptions {
        for (int i = 0; i < 100; i++) {
            if (i == 13){
                throw new MyExceptions("13 is coming");
            }
            System.out.println(i);
        }
    }
    private static void loop2() throws MySecondException {
        for (int i = 0; i < 100; i++) {
            if (i == 13){
                throw new MySecondException("13 is coming");
            }
            System.out.println(i);
        }
    }
}
