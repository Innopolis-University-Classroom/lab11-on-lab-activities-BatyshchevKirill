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
class iPhone{
    void chargeI(){
        System.out.println("The iphone is charged");
    }
}
class Android{
    void chargeA(){
        System.out.println("The android is charged");
    }
}
class AndroidAdapter extends iPhone{
    private Android android;
    AndroidAdapter ( Android android){
        this.android= android;
    }
    void chargeI (){
        android.chargeA();
    }
}

