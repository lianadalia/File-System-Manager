package src.main.java.files;


import java.io.IOException;
import java.util.Scanner;

import src.main.java.menu.Inputs;

public class FileManipulation {
    public String name;
    public String UserInteraction;

    public static void getNameOfFile(int option) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        Inputs input = new Inputs();
        int valinta = input.getMenu2(sc);

        while (valinta != 0) {

            switch (valinta) {
                case 1:
                    InfoDracula.getType();  
                    break;
                case 2:
                    InfoDracula.getTypeSize();
                    break;
                case 3:
                    InfoDracula.getCountLine();
                    break;
                case 4: 
                    InfoDracula.getWord();
                    break; 
                    default:
                    System.out.println("No command found!");
            }valinta=input.getMenu2(sc);
    }
    }

    
    
}

