public class Bicycle extends Transport implements TyreChangeable{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void check() {
        changeTyre(this.getTyreCount());
    }


}
