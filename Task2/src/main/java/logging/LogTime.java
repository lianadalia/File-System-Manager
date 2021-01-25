package src.main.java.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LogTime {
    public static void logDateAndMs(long now, long after, String command) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dateNow = LocalDateTime.now();
        
        try {
            File myObj = new File("filemanipulationlogs.txt");
            if (myObj.createNewFile()) {
                System.out.println();
            } else {
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("filemanipulationlogs.txt", true);
            myWriter.write("\n" + dtf.format(dateNow) + ": " + command + "\n");
            myWriter.write("Function took " + (Math.subtractExact(after, now)) + "ms to execute");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}

