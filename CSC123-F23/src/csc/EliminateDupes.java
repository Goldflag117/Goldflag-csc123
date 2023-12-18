package csc;

import java.io.*;
import java.util.*;

public class EliminateDupes {
    public static void main(String[] args) {
        try {
            // Read input file
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\creep\\OneDrive\\Desktop\\input.txt"));
            Set<String> uniqueLines = new HashSet<>();

            String line;
            while ((line = reader.readLine()) != null) {
                uniqueLines.add(line);
            }
            reader.close();

            // Write unique lines to new file
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\creep\\OneDrive\\Desktop\\output.txt"));
            for (String uniqueLine : uniqueLines) {
                writer.write(uniqueLine);
                writer.newLine();
            }
            writer.close();

            System.out.println("Duplicates eliminated. Unique entries written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

