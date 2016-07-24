package Builder;

/**
 * Created by lukasz on 23.07.16.
 */
public class CarShop {
    public static void main(String[] args) {
        Car car = new Car.Builder("Audi").color("Black").price(12000).build();
        Car car2 = new Car.Builder("Audi").build();
        System.out.println(car);
        System.out.println(car2);
    }
}
