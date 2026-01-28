import java.util.Random;

public class BikeFactory {

    public static Bike createExpensiveBike() {
        Random rnd = new Random();
        String[] brands = {"Scott", "Specialized", "Nishiki"};

        return new Bike(brands[rnd.nextInt(brands.length)], rnd.nextDouble(2000)+500);
    }

    public static Bike createCheapBike() {
        Random rnd = new Random();
        String[] brands = {"Insera", "Yosemite"};

        return new Bike(brands[rnd.nextInt(brands.length)], rnd.nextDouble(400)+100);
    }
}
