public class Xiaomi extends  Phone{
    public Xiaomi(String model, int numRelease, int numCamera) {
        super(model, numRelease, numCamera);
    }
    private String charge = "Type C";

    public String getCharge() {
        return charge;
    }

    @Override
    public void print() {
        System.out.println("Model: "+getModel()+
                "\nNumber of release: "+getNumRelease()+
                "\nNumber of camera: "+getNumCamera()+
                "\nCharge: "+ getCharge());


    }
}
