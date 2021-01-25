package src.main.java.menu;
import java.util.Scanner;

public class Inputs {
    public int getMenu1(Scanner sc) {
        System.out.println("Choose an option:\n1. List files in the folder\n2. Files by extension\n3. Manipulate dracula.txt\n0. Exit");
        return Integer.parseInt(sc.nextLine());
    }

    public int getMenu2(Scanner sc) {
        System.out.println("Choose an option:\n1. Get file name \n2. Get file size\n3. Check line count\n4. Search for a specific word\n0. Return");
        return Integer.parseInt(sc.nextLine());
    }
    
}

