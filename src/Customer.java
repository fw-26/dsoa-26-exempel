import java.io.Serializable;

public class Customer implements Serializable {
    private double funds;
    private Bike currentBike = null;

    public Customer(double funds) {
        this.funds = funds;
    }

    public boolean buyBike(Bike bike) {
        if (bike.getPrice() > funds) return false;
        funds -= bike.getPrice();
        currentBike = bike;
        return true;
    }

    public Bike getCurrentBike() {
        return currentBike;
    }

    public double getFunds() {
        return funds;
    }
}
