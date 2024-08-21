import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D3q1{
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
          
            reader = new BufferedReader(new FileReader("C:\\Users\\HP\\Documents\\NetBeansProjects\\Advantal\\ff"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File reader closed successfully.");
                }
            } catch (IOException e) {
                System.err.println("Failed to close the file reader: " + e.getMessage());
            }
        }
    }
}
