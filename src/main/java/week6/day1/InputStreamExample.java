package week6.day1;

import sun.net.www.content.text.plain;

import java.io.*;

/**
 * Created by Alexander on 12.11.2016.
 */
public class InputStreamExemple {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream(new File("/src/main/recources/dir1/plain.txt"));
            System.out.println(is.read());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null)
                try {
                    is.close();
                } catch (IOException e){

                }
        }

    }
}
