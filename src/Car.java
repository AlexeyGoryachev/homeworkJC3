public class Car extends Vehicle implements Maintenance{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
    }
}
