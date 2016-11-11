package week5.day1.exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Alexander on 05.11.2016.
 */
public class TestTryWithResources {
    public static void main(String[] args) {


        try(Scanner sc = new Scanner(System.in)) {

            sc.nextInt();
        } catch (InputMismatchException e){

        }
    }
}
