package hasch;

import java.util.ArrayList;

public class Drone {
	private int maxLoad;
	private int posX;
	private int posY;
	private ArrayList<DroneLoad> load;
	public Drone(){
		load = new ArrayList();
		posX = Universe.warehouses[0].getPosX();
		posY = Universe.warehouses[0].getPosY();
		maxLoad = Universe.MAX_LOAD;
	}
}
