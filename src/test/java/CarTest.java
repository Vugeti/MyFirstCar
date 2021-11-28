import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void shouldCreateCar(){

        Car carTest1 = new Car(10,3,2021);

        double fuelInTank = carTest1.getFuelInTank();
        double fuelCons = carTest1.getFuelConsumption();
        double inspection = carTest1.getInspectionDate();

        Assertions.assertEquals(fuelInTank,10);
        Assertions.assertEquals(fuelCons,3);
        Assertions.assertEquals(inspection, 2021);
}
}
//тест: может ли ехать машина когда в баке 0  топлива?
//поедет ли машина если у нее будет полный бак?
//можно ли использовать машину по истечению 2х лет после ТО?
//можна использовать машину если прошло меньше 2х лет после ТО?
//дистанция совпадает с расходом?