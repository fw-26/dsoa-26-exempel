public class Shirt extends Clothing implements Shoppable {

    Shirt(int condition) {
        super(condition);
    }

    void mend() {
        super.condition = 90;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public int getStock() {
        return 0;
    }
}
