abstract class Vehicle {

    private String name;
    private String vehicleType;

    double price;
    double discount = 1;

    public Vehicle(String name, String vehicleType) {
        this.name = name;
        this.vehicleType = vehicleType;
    }

    public String soundWarning() {
        return "default sound";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public double getPrice() {
        return price*discount;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price cannot be negative");
        }
        this.price = price;
    }
}
