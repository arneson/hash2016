package hasch;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	public ArrayList<WarehouseItem> items;
	public int posX;
	public  int posY;

	public Warehouse(int posX,int posY){
		this.posX = posX;
		this.posY = posY;
		this.items = new ArrayList();
	}

	public Warehouse(int posX,int posY,ArrayList<WarehouseItem> items){
		this.posX = posX;
		this.posY = posY;
		this.items = items;
	}

	public List<ProductLine> hasProducts(List<ProductLine> productsIWant){
		List<ProductLine> productsIHave = new ArrayList<>();
		for(ProductLine p : productsIWant){
			for (WarehouseItem item : items){
				if (item.lineItem.id == p.lineItem.id){
					int amount = 0;
					if (item.amount > p.amount)
						amount = p.amount;
					else
						amount = item.amount;
					productsIHave.add(new WarehouseItem(p.lineItem, amount));
				}

			}
		}
		return productsIHave;
	}

	public void addItem(WarehouseItem wi){
		int index = items.indexOf((wi));
		if(index>-1){
			items.get(index).increase(wi.getAmount());
		}else{
			items.add(wi);
		}
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
}
