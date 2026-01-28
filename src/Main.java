import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // new CCRandomRundown();

        Utils.hello();

        //System.exit(0);


        Scanner textInput = new Scanner(System.in);

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(BikeFactory.createExpensiveBike());
        bikeShop.addBike(BikeFactory.createExpensiveBike());
        bikeShop.addBike(BikeFactory.createCheapBike());
        bikeShop.addBike(BikeFactory.createCheapBike());

        System.out.println("Välkommen till Bike Shop! Våra cyklar:");
        for (int i = 0; i < bikeShop.getBikeCount(); i++) {
            Bike bike = bikeShop.getBike(i);
            System.out.printf("%d - %s %.2f € lagersaldo: %d st\n",
                    i+1,
                    bike.getName(),
                    bike.getPrice(),
                    bike.getStock());
        }

        while (true) {

            System.out.printf("\nVilken cykel vill du köpa? (1-%d, q to quit): ",
                    bikeShop.getBikeCount()
            );
            String bikeInput = textInput.nextLine();

            if (bikeInput.equalsIgnoreCase("q")) {
                System.out.println("Tack, välkommen åter!");
                System.exit(0);
            }

            if (!Utils.isPositiveInteger(bikeInput)) {
                System.out.println("Du måste ge ett positivt heltal!");
                continue;
            }

            int chosenBike = Integer.parseInt(bikeInput) - 1;

            if (chosenBike >= bikeShop.getBikeCount()+1) {
                System.out.println("Det finns ingen sådan cykel!");
                continue;
            }

            Bike bikeOwned = bikeShop.getBike(chosenBike);
            System.out.printf("Grattis, du äger nu cykel %s\n", bikeOwned.getName());
            break; // hoppa ut ut loopen

        }


    }

}
