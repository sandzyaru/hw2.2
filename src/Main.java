public class Main {

    public static void main(String[] args) {
        Printable [] phones = {createObjects("Iphone"),createObjects("Samsung"),createObjects("Xiaomi")};
        for (Printable printable:phones){
            printable.print();
        }
    }

   public static Printable createObjects(String Phone){

        return switch (Phone) {
           case ("Iphone"):
            Iphone iphone = new Iphone("Iphone 11", 1500, 3);
            break;
            case ("Samsung"):
            Samsung samsung = new Samsung("Samsung Galaxy A6+", 1300, 2);
            case ("Xiaomi"):
            Xiaomi xiaomi= new Xiaomi("Poco 6", 1600, 4);


            default:
                throw new IllegalStateException("Unexpected value: " + Phone);
        };
   }


        }


