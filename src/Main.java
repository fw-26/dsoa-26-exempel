import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner textInput = new Scanner(System.in);

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(BikeFactory.createExpensiveBike());
        bikeShop.addBike(BikeFactory.createExpensiveBike());
        bikeShop.addBike(BikeFactory.createCheapBike());
        bikeShop.addBike(BikeFactory.createCheapBike());


        Customer customer;
        Object loadedObject = FileUtils.loadObject("customer.save");
        if (loadedObject != null) {
            customer = (Customer) loadedObject;
        } else {
            customer = new Customer(1500);
        }

        System.out.printf("Välkommen till Bike Shop! Du har %.2f €.\n", customer.getFunds());
        if (customer.getCurrentBike() != null) {
            System.out.printf("Du har en %s\n", customer.getCurrentBike().getName());
        } else {
            System.out.println("Du äger ingen cykel.");
        }

        System.out.println("Våra cyklar:");

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

            Bike bikeToBuy = bikeShop.getBike(chosenBike);
            if (customer.buyBike(bikeToBuy)) {
                System.out.printf("Grattis, du äger nu cykel %s (du har %.2f € kvar)\n",
                        customer.getCurrentBike().getName(),
                        customer.getFunds()
                );
                break; // hoppa ut ut loopen
            } else {
                System.out.printf("Du har inte råd med %s (du har bara %.2f €)\n",
                        bikeToBuy.getName(),
                        customer.getFunds()
                );
            }
        }
        FileUtils.saveObject(customer, "customer.save");


        //System.out.println("Filens innehåll: " + FileUtils.readTextFile("greeting.txt"));
        //FileUtils.writeTextFile("Morjens, hejhej", "greeting.txt");

        // Code Challenge:
        //int userInteger = Utils.getIntInput("Skriv ett tal: ");
        //System.out.printf("Tack, du gav heltalet %s\n", userInteger);


    }

}
