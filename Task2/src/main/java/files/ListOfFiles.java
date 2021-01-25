package src.main.java.files;
import java.io.*;
import java.util.Scanner;

public class ListOfFiles {
    
    /**
     *
     */
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void getAllFiles() {
        System.out.println("Here are all the files: ");
        File directoryPath = new File("C:\\Users\\liana.hossain\\Desktop\\Noroff\\Files\\Files\\src\\resources");
        //List of all files and directories
        String contents[] = directoryPath.list();

        for (int i = 0; i < contents.length; i++) {
           System.out.println(contents[i]);
        }
    }

    public static void getExtension() {
        System.out.println("What extension are you looking for? (txt, png, jfif, jpg, jpeg)");
        File directoryPath = new File("C:\\Users\\liana.hossain\\Desktop\\Noroff\\Files\\Files\\src\\resources");
        String ext = SCANNER.nextLine();
    
        FilenameFilter textFilefilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                String lowercaseName = name.toLowerCase();
                if (lowercaseName.endsWith(ext)) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        String filesList[] = directoryPath.list(textFilefilter);
        System.out.println("List of these files: ");
        for (String fileName : filesList) {
            System.out.println(fileName);
        }

        
            
        {

     
    }
    }
}

