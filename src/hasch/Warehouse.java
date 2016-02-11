package hasch;

import java.util.ArrayList;

public class Warehouse {
	private ArrayList<WarehouseItem> items;
	private int posX;
	private int posY;
	public Warehouse(int posX,int posY){
		this.posX = posX;
		this.posY = posY;
	}
	public Warehouse(int posX,int posY,ArrayList<WarehouseItem> items){
		this.posX = posX;
		this.posY = posY;
		this.items = items;
	}
	public void addItem(WarehouseItem wi){
		int index = items.indexOf((wi));
		if(index>-1){
			items.get(index).increase(wi.getAmount());
		}else{
			items.add(wi);
		}
	}
}
