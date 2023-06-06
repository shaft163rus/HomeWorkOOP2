public class Truck extends Transport implements TyreChangeable, EngineCheckable, TrailerCheckable{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void check() {
        changeTyre(this.getTyreCount());
        checkEngine();
        checkTrailer();
    }
}
