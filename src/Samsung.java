public class Samsung extends  Phone{
    public Samsung(String model, int numRelease, int numCamera) {
        super(model, numRelease, numCamera);
    }

    @Override
    public void print() {
        System.out.println("Model: "+getModel()+
                "\nNumber of release: "+getNumRelease()+
                "\nNumber of camera: "+getNumCamera());

    }
}
