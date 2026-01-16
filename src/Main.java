public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        Car car = new Car("VW");
        Bike bike = new Bike("Scott");

        System.out.println(car.getName() + " is " + car.getVehicleType());
        System.out.println(bike.getName() + " is " + bike.getVehicleType());




    }

}
