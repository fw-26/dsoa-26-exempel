import java.io.Serializable;
import java.util.HashMap;

public class Bike extends Vehicle implements Shoppable, Serializable {

    /**
     * This is a bike class
     */

    private int stock = 0;
    DiscountCategory discountCat = DiscountCategory.NEW;

    private HashMap<String,String> specs = new HashMap<>();

    public Bike(String name) {
        super(name, "pedaled");
    }
    public Bike(String name, double price) {
        super(name, "pedaled");
        setPrice(price); // anropar superklassens setter
    }
    public Bike(String name, double price, DiscountCategory discountCat) {
        super(name, "pedaled");
        setPrice(price); // anropar superklassens setter
        this.discountCat = discountCat;
    }

    public void addSpec (String key, String value) {
        specs.put(key, value);
    }

    public String getSpecsString() {
        String ret = "";
        // for-each-loop
        for (String key: specs.keySet()) {
            ret += String.format(" - %s: %s\n",
                    key,
                    specs.get(key)
            );
        }
        return ret;
    }

    /* flyttad till BikeFactory
    public static Bike createRandomBike() {
        return new Bike("aasdasd", 12123);
    }
    */

    @Override
    public double getPrice() {
        double netPrice;
        switch (discountCat) {
            case DEMO:
                netPrice = getGrossPrice() * 0.9;
                break;
            case RETURNED:
                netPrice = getGrossPrice() * 0.8;
                break;
            case USED:
                netPrice = getGrossPrice() * 0.5;
                break;
            default:
                netPrice = getGrossPrice();
        }
        return netPrice;
    }

    @Override
    public String soundWarning() {
        return "pling-pling";
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    public DiscountCategory getDiscountCat() {
        return discountCat;
    }
}
