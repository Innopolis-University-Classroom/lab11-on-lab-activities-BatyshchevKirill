public class problem2 {
    public static void main(String[] args) {
        ChargerStation station = new ChargerStation();
        iPhone iPhone = new iPhone();
        station.chargeByLightning(iPhone);
        Android android = new Android();
        AndroidAdapter adapter= new AndroidAdapter(android);
        station.chargeByLightning(adapter);
    }
}

class ChargerStation{
    void chargeByLightning(iPhone iphone ){
        iphone.chargeI();
    }
}
interface LightningPort{
    void chargeI();
}
class iPhone implements LightningPort{
    @Override
    public void chargeI(){
        System.out.println("The iphone is charged");
    }
}
interface USBPort{
    void chargeA();
}
class Android implements USBPort{
    @Override
    public void chargeA(){
        System.out.println("The android is charged");
    }
}
class AndroidAdapter extends iPhone{
    private Android android;
    AndroidAdapter ( Android android){
        this.android= android;
    }
    @Override
    public void chargeI (){
        android.chargeA();
    }
}

