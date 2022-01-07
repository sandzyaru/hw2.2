public class Samsung extends  Phone{
    private String earPhones="Samsung Buds \uD83C\uDFA7";
    public Samsung(String model, int numRelease, int numCamera) {
        super(model, numRelease, numCamera);
    }

    @Override
    public void print() {
        System.out.println("Model: "+getModel()+
                "\nNumber of release: "+getNumRelease()+
                "\nNumber of camera: "+getNumCamera()+
                "\n"+earPhones);

    }
}
