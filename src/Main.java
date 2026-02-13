import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] testData = { "Frodo","Samwise","Gandalf","Aragorn","Legolas","Gimli","Boromir","Meriadoc","Peregrin","Arwen","Galadriel","Elrond","Saruman","Gollum","Éowyn","Éomer","Faramir","Théoden","Bilbo","Treebeard","Denethor","Shelob","Radagast","Haldir","Celeborn","Wormtongue" };

        /**
         * Queue
         */
        Queuey q = new Queuey();
        q.enqueue("Arwen");
        q.enqueue("Galadriel");
        q.enqueue("Haldir");
        System.out.println(q);
        System.out.println("dequeue: " + q.dequeue());
        System.out.println(q) ;
        q.enqueue("Elrond");
        System.out.println(q);

        /**
         * Stack
         */
        Stacky stacky = new Stacky(5);
        stacky.push("Meriadoc");
        stacky.push("Peregrin");
        stacky.push("Arwen");
        stacky.push("Galadriel");
        stacky.push("Elrond");
        //stacky.push(testData[12]);
        System.out.println(stacky);
        System.out.println("pop: " + stacky.pop());
        System.out.println("pop: " + stacky.pop());
        stacky.push("Saruman");
        stacky.push("Gollum");
        System.out.println(stacky);

        /**
         * Linked list
         */
        Linky linky = new Linky();
        linky.add(new Person(testData[3]));
        linky.add(new Person(testData[2]));
        linky.add(new Person(testData[5]));
        linky.add(new Person(testData[8]));

        System.out.println(linky.toString());
        System.out.println("Linky size: " + linky.size());


        /**
         * CC Circular Arr-gument
         */
        new CCCircularArr();

    }

}
