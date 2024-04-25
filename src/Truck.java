public class Truck extends Vehicle implements Maintenance{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
