public class Car extends Vehicle {

    // Konstanters värde ändrar ej i runtime
    static final String VEHICLE_TYPE = "Car";

    // Klassvariabel (fuel för alla bilar)
    // Alla objekt delar på samma variabel
    static int totalFuel = 0;

    // Instansvariabel
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

    public void refuel(int amount) {
        fuel += amount;
        totalFuel += amount;
    }

    public String getFuelInfo() {
        return String.format("Fuel %d (total fuel: %d)",
                getFuel(),
                getTotalFuel()
        );
    }

    public int getFuel() {
        return fuel;
    }
    public int getTotalFuel() {
        return totalFuel;
    }
}
