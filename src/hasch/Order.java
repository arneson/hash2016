package hasch;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comparable<Order>{
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

	@Override
	public int compareTo(Order order) {
        int thisAmount = 0;
        for (OrderLine orderLine : this.items)
            thisAmount += orderLine.amount;
        int otherAmount = 0;
        for (OrderLine orderLine : order.items)
            otherAmount += orderLine.amount;

        if (thisAmount == otherAmount)
            return 0;
        else if (thisAmount > otherAmount)
            return 1;
        else
            return -1;
    }
}
