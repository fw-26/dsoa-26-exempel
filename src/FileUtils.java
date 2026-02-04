import javax.xml.transform.Source;
import java.io.*;

public class FileUtils {

    public static Object loadObject(String fileName) {
        Object returnObj = null;

        try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(fileName))) {

            returnObj = objIn.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return returnObj;
    }

    public static void saveObject(Object objectToSave, String fileName) {
        try (ObjectOutputStream objOut =
             new ObjectOutputStream(new FileOutputStream(fileName))) {

            objOut.writeObject(objectToSave);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

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
