import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // new CCRandomRundown();

        Utils.hello();

        //System.exit(0);


        Scanner textInput = new Scanner(System.in);

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(new Bike("Scott", 500));
        bikeShop.getBike(0).addSpec("wheel-size", "29 inch");
        bikeShop.getBike(0).addSpec("suspension", "hardtail");

        bikeShop.addBike(new Bike("Jopo", 200));
        bikeShop.getBike(1).addSpec("wheel-size", "24 inch");
        bikeShop.getBike(1).addSpec("suspension", "none");

        bikeShop.addBike(new Bike("Bianchi", 700));
        bikeShop.getBike(2).addSpec("frame", "carbon");


        System.out.println("Välkommen till Bike Shop! Våra cyklar:");
        for (int i = 0; i < bikeShop.getBikeCount(); i++) {
            Bike bike = bikeShop.getBike(i);
            System.out.printf("%d - %s %.2f € lagersaldo: %d st\n%s",
                    i+1,
                    bike.getName(),
                    bike.getPrice(),
                    bike.getStock(),
                    bike.getSpecsString());
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

            try {
                // Integer.parseInt(str) ändrar String till int
                int chosenBike = Integer.parseInt(bikeInput) - 1;
                Bike bikeOwned = bikeShop.getBike(chosenBike);
                System.out.printf("Grattis, du äger nu cykel %s\n", bikeOwned.getName());
                break; // hoppa ut ut loopen

            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Det finns ingen sådan cykel!");
            } catch (Exception e) {
                System.out.println("Någonting gick fel. " + e.getMessage());
            }
        }


    }

}
