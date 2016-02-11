package hasch;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private ArrayList<OrderLine> items;
	int posX;
	int posY;

	public List getFirst(double part, List<Product> inputList){
		List originalList = inputList;
		List partedList = new ArrayList<>();
		double partSize = 0;
		int i = 0;
		while(partSize < part) {
			partedList.add(inputList.indexOf(i));
			inputList.remove(i);
			i++;
			partSize =(double) inputList.size()/ (double) originalList.size();
		}
		return partedList;
	}


}
