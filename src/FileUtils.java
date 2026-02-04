import java.io.*;

public class FileUtils {

    public static void writeTextFile(String textContent, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(textContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readTextFile(String fileName) {
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line); // lägg till raden till StringBuilder-objektet
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileContent.toString();
    }
}
