import org.w3c.dom.ls.LSOutput;

public class CCCircularArr {

    CCCircularArr() {
        String[] weekdays = { "må", "ti", "on", "to", "fr", "lö", "sö" };

        int today = 4;
        System.out.println("I dag är det " + weekdays[today]);
        System.out.println("I övermorgon är det " + weekdays[(today+2) % 7]); // eller weekdays.length
        System.out.println("Om 5 dagar är det " + weekdays[(today+5) % 7]);
        System.out.println("Om 20 dagar är det " + weekdays[(today+20) % 7]);

    }



}
