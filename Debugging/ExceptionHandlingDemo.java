
package advantal;
import java.io.*;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            processFile("test.txt");
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    private static void processFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line == null) {
                throw new FileNotFoundException("File is empty or not found");
            }
            System.out.println("File Content: " + line);
        }
//        } catch (FileNotFoundException e) {
//            System.err.println("FileNotFoundException: " + e.getMessage());
//            throw e; // Rethrow exception
//        }
    }
}
