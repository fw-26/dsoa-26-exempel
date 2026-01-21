import java.util.ArrayList;
import java.util.HashMap;

public class BikeShop {

    private ArrayList<Bike> bikes = new ArrayList<>();


    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    public Bike getBike(int i) {
        return bikes.get(i);
    }

    public int getBikeCount() {
        return bikes.size();
    }


}
