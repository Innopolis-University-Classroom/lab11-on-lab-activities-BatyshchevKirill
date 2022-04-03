public class problem2 {
    public static void main(String[] args) {
        ChargerStation station = new ChargerStation();
        Iphone iPhone = new Iphone();
        station.chargeByLightning(iPhone);
        AndroidAdapter adapter= new AndroidAdapter();
        station.chargeByLightning(adapter);
    }
}
interface LightningPort{
    void chargeIphone();
}
interface USBPort{
    void chargeAndroid();
}
class Android implements USBPort{
    @Override
    public void chargeAndroid() {
        System.out.println("The android is charged");
    }
}
class AndroidAdapter implements LightningPort{
    Android android;
    public AndroidAdapter(){
        android = new Android();
    }

    @Override
    public void chargeIphone() {
        android.chargeAndroid();
    }
}
class Iphone implements LightningPort{
    @Override
    public void chargeIphone() {
        System.out.println("The iphone is charged");
    }
}
class ChargerStation{
    void chargeByLightning(LightningPort iphone){
        iphone.chargeIphone();
    }
}
