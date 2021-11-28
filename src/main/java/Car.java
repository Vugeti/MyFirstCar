import java.util.Date;

public class Car {
    private double fuelInTank;
    private double fuelConsumption;
    private double inspectionDate;

    public double getFuelInTank() {
        return fuelInTank;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getInspectionDate() {
        return inspectionDate;
    }

    public Car(double fuelInStock, double fuelConsumption, double inspectionDate) {
        this.fuelInTank = fuelInStock;
        this.fuelConsumption = fuelConsumption;
        this.inspectionDate = inspectionDate;
    }

    public boolean trafficCondition() {
        return fuelInTank != 0;
    }

    public boolean inspectionCondition() {
        if (inspectionDate < 2020) {
            return false;
        }
        return true;
    }

    public double canDrove(){
        return fuelInTank/fuelConsumption*100;
    }
}