import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        String fileName = "greet.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            };
        }
    }
