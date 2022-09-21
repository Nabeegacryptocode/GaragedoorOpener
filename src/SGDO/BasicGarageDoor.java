package SGDO;

import java.util.logging.Logger;

public class BasicGarageDoor implements StdGarageDoorOpener {
    private Logger log = Logger.getLogger(
    		BasicGarageDoor.class.getSimpleName());
    
	@Override
	public void open() {
    	log.info("Garage Door is Opening");

	}

	@Override
	public void close() {
    	log.info("Garage Door is Closing");

	}

}
