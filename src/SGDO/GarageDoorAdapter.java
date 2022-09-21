package SGDO;

public class GarageDoorAdapter implements StdGarageDoorOpener {
    PremiumGarageDoorOpener prem1;
    public GarageDoorAdapter(PremiumGarageDoorOpener prem1){
        this.prem1 =prem1;


    }
    //Arbitrary values for the speed of the GarageDoor

    @Override
    public void open(){
        prem1.openDoor(7);
    }
    @Override
    public void close(){
        prem1.openDoor(7);
    }


}
