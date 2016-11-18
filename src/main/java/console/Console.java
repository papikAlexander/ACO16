package console;

import utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Alexander on 18.11.2016.
 */
public  class Console {

    public void start(){
        Scanner sc = new Scanner(System.in);
        File directory = new File("C:/Users/Alexander/IdeaProjects/ACO16/src/main/recources");

        while(true) {

            System.out.print(directory.getPath() + ">");
            String enterCommand = sc.nextLine();
            String[] command = enterCommand.split(" ");

            switch (command[0]) {
                case "ls":
                    ls(directory);
                    break;

                case "pwd":
                    pwd(directory);
                    break;

                case "cd":
                    if (command.length == 1) directory = cd();
                    else if (command[1].equals("..")) directory = cd_points(directory);
                    else directory = cd_directory(command[1], directory);
                    break;

                case "mkdir":
                    int index = command[1].indexOf("\\");
                    if (index == -1) mkdir(command[1], directory);
                    else mkdirs(command[1]);
                    break;

                case "mv":
                    if (command.length != 3) {
                        System.err.println("wrong command");
                        break;
                    }
                    mv(command[1], command[2]);
                    break;

                case "rm":
                    if (command.length == 1) System.err.println("wrong command");
                    rm(command[1], directory);
                    break;

                case "cp":
                    if (command.length == 1 || command.length == 2) System.err.println("wrong command");
                    cp(command[1], command[2]);
                    break;

                case "exit":
                    return;

                default:
                    System.out.println(false);
            }
        }
    }

    private void ls(File file){
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private void pwd(File file){
        System.out.println(file.getPath());
    }

    private File cd() {
        return new File("C:/Users");

    }

    private File cd_points(File file){
        StringBuilder tmp = new StringBuilder(file.getPath());
        int index = tmp.lastIndexOf("\\");

        if (index > 2) return new File(tmp.substring(0, index));
        else return file;
    }

    private File cd_directory(String directory, File file){
        File tmp = new File(directory);
        if (!tmp.isDirectory()){
            System.err.println("not found directory");
            return file;
        }
        return new File(directory);
    }

    private void mkdir(String name, File file){
        System.out.println("lol");
        File tmp = new File(file.getPath() + "\\" + name);
        tmp.mkdir();
    }

    private void mkdirs(String directory){
        File tmp = new File(directory);
        System.out.println(directory);
        tmp.mkdirs();
    }

    private void mv(String dir1, String new_dir){
        File old = new File(dir1);
        old.renameTo(new File(new_dir));
    }

    private void rm(String name, File file){
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(name)){
                File tmp = new File(file.getPath() + "\\" + name);
                tmp.delete();
                return;
            }
        }
    }

    private void cp(String directoryFile, String directoryCopyFile){
        FileUtils.copy(directoryFile, directoryCopyFile);
    }

}
