public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        Car car = new Car("VW");
        Car car2 = new Car("Tesla");

        System.out.println(car.getName());
        car.setName("Volvo");
        System.out.println(car.getName());
        System.out.println(car2.getName());

    }

}
