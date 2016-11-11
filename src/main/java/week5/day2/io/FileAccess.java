package week5.day2.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Alexander on 06.11.2016.
 */
public class FileAccess {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/recources/dir1/dir2");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.isDirectory());
        File[] files = file.listFiles();
        for (File innerFiles : files){
            System.out.println(innerFiles.getName());
        }

       // System.out.println(file.delete());
        File newFile = new File("./src/main/recources/dir1/plain.txt");

        System.out.println(newFile.isDirectory());

        System.out.println(newFile.createNewFile());
        File newDir = new File("./src/main/recources/dir1/dir2/dir3");
        System.out.println(newDir.mkdirs());

        newDir.renameTo(new File("./src/main/recources/dir1/dir2/dir6"));
    }
}
