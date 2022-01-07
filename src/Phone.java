public abstract class Phone implements Printable {
    private String model;
    private int numRelease;
    private int numCamera;

    public String getModel() {
        return model;
    }

    public int getNumRelease() {
        return numRelease;
    }

    public int getNumCamera() {
        return numCamera;
    }

    public Phone (String model, int numRelease , int numCamera) {
        this.model=model;
        this.numRelease=numRelease;
        this.numCamera=numCamera;
    }
}
