package hasch;

import java.util.ArrayList;

public class Drone {
	public int maxLoad;
	public int posX;
	public int posY;
	public ArrayList<DroneLoad> load;

	public Drone(){
		load = new ArrayList();
		posX = Universe.warehouses[0].getPosX();
		posY = Universe.warehouses[0].getPosY();
		maxLoad = Universe.MAX_LOAD;
	}

}
