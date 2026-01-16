public class Shirt extends Clothing {

    Shirt(int condition) {
        super(condition);
    }

    void mend() {
        super.condition = 90;
    }
}
