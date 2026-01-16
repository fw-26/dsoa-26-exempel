public class Car extends Vehicle {

    private int fuel = 0;

    // Overload (överlagring)
    // behävs för att tillåta olika antal parametrar
    public Car(String name, double price) {
        super(name, "motorized");
        super.price = price;
        super.discount = 0.9499999;
    }
    public Car(String name) {
        super(name, "motorized");
        super.discount = 0.9499999;
    }

    @Override
    public String soundWarning() {
        return "tut-tut";
    }

    // overload
    public void refuel(int amount) {
        fuel += amount;
    }
    public void refuel() {
        fuel = 100;
    }

}
