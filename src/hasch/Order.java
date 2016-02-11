package hasch;

import java.util.ArrayList;

public class Order {
	public Order(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		items = new ArrayList();
	}
	private ArrayList<OrderLine> items;
	int posX;
	int posY;
	public void addItem(Product p){
		int index = items.indexOf(p);
		if(index>0){
			items.get(index).increase(1);
		}else{
			items.add(new OrderLine(p,1));
		}
	}
}
