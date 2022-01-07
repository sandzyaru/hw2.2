public class  Iphone extends Phone {
    private String logo = "\uD83C\uDF4E";

    public String getLogo() {
        return logo;
    }

    public Iphone(String model, int numRelease, int numCamera) {
        super(model, numRelease, numCamera);
    }

    @Override
    public void print() {
        System.out.println("Model: "+getModel()+
                "\nNumber of release: "+getNumRelease()+
                "\nNumber of camera: "+getNumCamera()+
                "\nLogo: "+getLogo());

    }
}
