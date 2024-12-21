import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) {
        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("This is a test.");
            writer.newLine();
            writer.write("Writing to the file using BufferedWriter.");
            System.out.println("Content written to output.txt.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
