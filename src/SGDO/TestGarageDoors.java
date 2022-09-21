package SGDO;

public class TestGarageDoors {


public static void main (String args[]){

    BasicGarageDoor obj1 = new BasicGarageDoor();
    PremiumGarageDoorOpener obj3 = new PremiumGarageDoorOpener();
    StdGarageDoorOpener obj2 = new GarageDoorAdapter(obj3);
    //Test function
    obj2.open();
    obj2.close();
    obj3.openDoor(9);
    obj3.closeDoor(7);
    obj1.open();
    obj1.close();


}
}
