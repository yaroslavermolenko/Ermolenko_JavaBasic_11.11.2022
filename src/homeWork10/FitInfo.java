package homeWork10;

public class FitInfo {

    private double weight;
    private String pressure;
    private int pedometerPerDay;

    public FitInfo(double weight, String pressure, int pedometerPerDay) {
        this.weight = weight;
        this.pressure = pressure;
        this.pedometerPerDay = pedometerPerDay;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getPedometerPerDay() {
        return pedometerPerDay;
    }

    public void setPedometerPerDay(int pedometerPerDay) {
        this.pedometerPerDay = pedometerPerDay;
    }

    @Override
    public String toString() {
        return "FitInfo{" +
                "weight=" + weight +
                ", pressure='" + pressure + '\'' +
                ", pedometerPerDay=" + pedometerPerDay +
                '}';
    }
}