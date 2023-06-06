abstract public class Transport {

    private String modelName;
    private int tyreCount;

    public Transport(String modelName, int tyreCount) {
        this.modelName = modelName;
        this.tyreCount = tyreCount;
    }

    abstract void check();

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getTyreCount() {
        return tyreCount;
    }

    public void setTyreCount(int tyreCount) {
        this.tyreCount = tyreCount;
    }


}
