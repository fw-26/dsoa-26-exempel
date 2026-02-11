import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] testData = { "Frodo","Samwise","Gandalf","Aragorn","Legolas","Gimli","Boromir","Meriadoc Brandybuck","Peregrin Took","Arwen","Galadriel","Elrond","Saruman","Gollum","Éowyn","Éomer","Faramir","Théoden","Bilbo Baggins","Treebeard","Denethor","Shelob","Radagast","Haldir","Celeborn","Gríma Wormtongue" };

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
