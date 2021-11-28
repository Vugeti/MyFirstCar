import java.util.Date;

public class main {
    public static void main(String[] args) {
        Car car = new Car(0,0,2020);
        System.out.println(car.canDrove());
        System.out.println(car.inspectionCondition());
        System.out.println(car.trafficCondition());
        Date a = new Date();
        System.out.println(a);
    }
}
