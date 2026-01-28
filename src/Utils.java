public class Utils {

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
