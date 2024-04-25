public class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        setModelName(modelName);
        setWheelsCount(wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
