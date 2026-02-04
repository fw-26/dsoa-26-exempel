import java.sql.SQLOutput;
import java.util.Scanner;

public class Utils {

    /**
     * Code Challenge: Good input, Bad input
     */
    public static int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal!");
            }
        }
    }
    // Overload med default-fråga
    public static int getIntInput() {
        return getIntInput("Ge ett heltal: ");
    }

    public static void hello() {
        System.out.println("Hello!");
    }

    public static boolean isPositiveInteger(String str) {
        return str.matches("[0-9]+");
    }

    public static void writeLog(String msg) {
        // write msg to logfile, simulated here with sout
        System.out.println("Log: " + msg);

    }

}
