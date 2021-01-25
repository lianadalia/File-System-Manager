package src.main.java.files;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import src.main.java.logging.*;

public class InfoDracula {
    static String fileName = "src/main/resources/Dracula.txt";

    public static void getType() {
        long now = System.currentTimeMillis();
        File f1 = new File(fileName);
        String name = f1.getName();
        System.out.println(name);
        long after = System.currentTimeMillis();
        LogTime.logDateAndMs(now, after, name);
    }

    public static void getTypeSize() {
        long now = System.currentTimeMillis();
        File f2 = new File(fileName);
        long fileSize = f2.length();
        String text = "The size of the file: ";
        var result = text + fileSize + " bytes";
        System.out.format(result);
        long after = System.currentTimeMillis();
        LogTime.logDateAndMs(now, after, result);
    }

    public static void getCountLine() {
        long now = System.currentTimeMillis();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lines = 0;
            while (reader.readLine() != null) {
                lines++;
            }
            var command = "Lines counted: " + lines;
            System.out.println(command);
            reader.close();
            long after = System.currentTimeMillis();
            LogTime.logDateAndMs(now, after, command);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void getWord() throws IOException {
        long now = System.currentTimeMillis();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a word:");
        String searchWord = sc1.nextLine().toLowerCase();
        File f4 = new File(fileName);
        String[] words = null;
        FileReader f3 = new FileReader(f4);
        BufferedReader bReader = new BufferedReader(f3);
        String string;     
        int count = 0;

        while ((string = bReader.readLine()) != null) {
            words = string.split(" ");
            for (String word : words) {
                if (word.toLowerCase().equals(searchWord)) {
                    count++;
                }
            }
        }

        if (count != 0) {
            var command = "The word is \""+ searchWord + "\" is present for " + count + " times in the file.";
            System.out.println(command);
            long after = System.currentTimeMillis();
            LogTime.logDateAndMs(now, after, command);
        } else {
            var command = "The word is \"" + searchWord + "\" is not present in the file.";
            System.out.println(command);
            long after = System.currentTimeMillis();
            LogTime.logDateAndMs(now, after, command);
        }

        
        bReader.close();
    }
    
}
