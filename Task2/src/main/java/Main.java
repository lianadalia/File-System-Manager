package src.main.java;

import java.io.IOException;
import java.util.Scanner;

import src.main.java.files.*;
import src.main.java.menu.*;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Inputs input = new Inputs();
        int option = input.getMenu1(sc);

        while (true) {
            if (option == 0) {
                System.out.println("End of program");
                break;
            }
            
            switch (option) {
                case 1:
                    ListOfFiles.getAllFiles();
                    break;
                case 2:
                    ListOfFiles.getExtension();
                    break;
                case 3:
                    FileManipulation.getNameOfFile(option); 
                    break;
                
                default:
                    System.out.println("No command found!");
            }
        option = input.getMenu1(sc);
        }
    }
    
}
    
   
