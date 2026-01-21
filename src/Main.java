public class Main {

    public static void main(String[] args) {

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(new Bike("Scott", 500));
        bikeShop.getBike(0).addSpec("wheel-size", "29 inch");
        bikeShop.getBike(0).addSpec("suspension", "hardtail");

        System.out.println(bikeShop.getBike(0).getSpecsString());

        bikeShop.addBike(new Bike("Jopo", 200));
        bikeShop.getBike(1).addSpec("wheel-size", "24 inch");
        bikeShop.getBike(1).addSpec("suspension", "none");

        bikeShop.addBike(new Bike("Bianchi", 700));
        bikeShop.getBike(2).addSpec("frame", "carbon");


        System.out.println("Välkommen till Bike Shop! Våra cyklar:");
        for (int i = 0; i < bikeShop.getBikeCount(); i++) {
            Bike bike = bikeShop.getBike(i);
            System.out.printf("%s %.2f saldo: %d\n%s",
                    bike.getName(),
                    bike.getPrice(),
                    bike.getStock(),
                    bike.getSpecsString());
        }

        System.exit(0);

        Car car = new Car("VW", 12000);
        Car car2 = new Car("Volvo", 22000);;

        car.refuel(50);

        System.out.printf("%s %s)\n",
                car.getName(),
                car.getFuelInfo());

        car2.refuel(100);
        System.out.printf("%s %s\n",
                car2.getName(),
                car2.getFuelInfo()
        );

        Vehicle bike = new Bike("Scott");





    }

}
