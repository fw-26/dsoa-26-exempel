import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //String[] testData = { "Frodo","Samwise","Gandalf","Aragorn","Legolas","Gimli","Boromir","Meriadoc","Peregrin","Arwen","Galadriel","Elrond","Saruman","Gollum","Éowyn","Éomer","Faramir","Théoden","Bilbo","Treebeard","Denethor","Shelob","Radagast","Haldir","Celeborn","Wormtongue" };

        /**
         * Grafstruktur
         */
        Graphy graphy = new Graphy();
        graphy.addNode("Skjorta");
        graphy.addNode("Slips");
        graphy.addNode("Jeans");
        graphy.addNode("Crocs");

        graphy.addEdge("Skjorta", "Slips");
        graphy.addEdge("Skjorta", "Jeans");
        graphy.addEdge("Crocs", "Jeans");


        System.out.println(graphy);








    }

}
