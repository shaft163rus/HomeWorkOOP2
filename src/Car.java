public class Car extends Transport implements TyreChangeable, EngineCheckable{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        changeTyre(this.getTyreCount());
        checkEngine();

    }
}
