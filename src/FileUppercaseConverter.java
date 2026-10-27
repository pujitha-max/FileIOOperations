
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUppercaseConverter {

    public static void main(String[] args) {
        Path inputFile = Path.of("input.txt");
        Path outputFile = Path.of("output.txt");

        try {
            String data = Files.readString(inputFile);
            String uppercaseData = data.toUpperCase();

            Files.writeString(outputFile, uppercaseData);

            System.out.println(
                    "File copied successfully in uppercase."
            );
            System.out.println("Output file: output.txt");

        } catch (IOException e) {
            System.out.println(
                    "Error: Unable to read or write the file."
            );
            System.out.println("Details: " + e.getMessage());
        }
    }
}
