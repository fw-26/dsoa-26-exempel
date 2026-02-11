import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] testData = { "Frodo","Samwise","Gandalf","Aragorn","Legolas","Gimli","Boromir","Meriadoc Brandybuck","Peregrin Took","Arwen","Galadriel","Elrond","Saruman","Gollum","Éowyn","Éomer","Faramir","Théoden","Bilbo Baggins","Treebeard","Denethor","Shelob","Radagast","Haldir","Celeborn","Gríma Wormtongue" };

        Person p1 = new Person(testData[3]);
        Person p2 = new Person(testData[2], p1);
        Person p3 = new Person(testData[1], p2);
        Person p4 = new Person(testData[0], p3);

        // Vi lägger till ett element med O(1)
        Person pMid = new Person("mid-person", p2);
        p3.next = pMid;

        Person current = p4;
        while (current != null) {
            System.out.println(current.getName());
            current = current.next;
        }







        System.exit(0);

        StringArray names = new StringArray(testData);
        System.out.println(names.toString());
        names.append("Sauron");
        System.out.println(names.toString());
        names.insert(4, "Brego");
        System.out.println(names.toString());
        names.reverse();
        System.out.println(names.toString());
        // new BigO();



    }

}
