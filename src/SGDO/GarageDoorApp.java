package SGDO;

import java.util.logging.Logger;

public class GarageDoorApp {
    private Logger log = Logger.getLogger(
    		GarageDoorApp.class.getSimpleName());
    private StdGarageDoorOpener garageDoorOpener;
    public GarageDoorApp(StdGarageDoorOpener garageDoorOpener) {
    	this.garageDoorOpener = garageDoorOpener;
    }
    public void openDoor() {
    	this.garageDoorOpener.open();
    	log.info("Garage Door is Open");
    }
    public void closeDoor() {
    	this.garageDoorOpener.close();
    	log.info("Garage Door is Closed");
    }
}
