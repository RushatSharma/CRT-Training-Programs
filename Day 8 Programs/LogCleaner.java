import java.io.*;
import java.util.*;

public class LogCleaner {
    public static void main(String[] args) {
        String inputFile = "log.txt";
        String outputFile = "clean_log.txt";

        Set<String> uniqueLines = new LinkedHashSet<>();

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                uniqueLines.add(line);
            }

            for (String uniqueLine : uniqueLines) {
                writer.write(uniqueLine);
                writer.newLine();
            }

            System.out.println("Duplicate lines removed. Cleaned file created: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
