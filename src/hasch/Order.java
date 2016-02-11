package hasch;

import java.util.ArrayList;

public class Order implements Comparable<Order>{
	public ArrayList<OrderLine> items;
    public int posX;
    public int posY;


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
		else if(thisAmount > otherAmount)
			return 1;
		else
			return -1;
	}
}
