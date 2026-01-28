import java.util.Random;
import java.util.Scanner;

public class CCRandomRundown {

    public CCRandomRundown() {

        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.printf("Slumptal: %d\n", rnd.nextInt(99));
            System.out.println("Tryck [Enter] för ett nytt tal, q för att avsluta.");

        } while (!scanner.nextLine().equalsIgnoreCase("q"));


        /*
        while (true) {
            System.out.printf("Slumptal: %d\n", rnd.nextInt(99));
            System.out.println("Tryck [Enter] för ett nytt tal, q för att avsluta.");

            if (scanner.nextLine().equalsIgnoreCase("q")) {
                break;
            }
        }
        */


    }
}
