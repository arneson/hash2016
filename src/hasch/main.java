package hasch;

import java.util.Scanner;

public class main {
	public static void main(String[] args){
		Scanner s = new Scanner(args[0]);
		String currentRow;
		while(s.hasNext()){
			currentRow = s.nextLine();
			String[] items = currentRow.split(" ");
			Universe.grid = new int[Integer.parseInt(items[0])][Integer.parseInt(items[1])];
			Universe.DEADLINE = Integer.parseInt(items[3]);
			Universe.MAX_LOAD = Integer.parseInt(items[4]);
			Universe.NUMBER_OF_DRONES = Integer.parseInt(items[2]);
			int numberOfProducts = Integer.parseInt(s.nextLine());
			Universe.products = new Product[numberOfProducts];
			for(int i = 0; i<numberOfProducts;i++){
				int id = s.nextInt();
				Universe.products[id] = (new Product(id,s.nextInt()));
			}
			int numberOfWarehouses = Integer.parseInt(s.nextLine());
			for(int v = 0; v<numberOfWarehouses;v++){
				String[] wData = s.nextLine().split(" ");
				Warehouse w = new Warehouse(Integer.parseInt(wData[0]),Integer.parseInt(wData[1]));
				String[] warehouseItemCounts = s.nextLine().split(" ");
				for(int wi = 0; wi<warehouseItemCounts.length;wi++){
					int am = Integer.parseInt(warehouseItemCounts[wi]);
					if(Integer.parseInt(warehouseItemCounts[wi])>0){
						w.addItem(new WarehouseItem(Universe.products[wi],am));
					}
				}
			}
			int numberOfOrders = Integer.parseInt(s.nextLine());
			Universe.orders = new Order[numberOfOrders];
			for (int o = 0; o<numberOfOrders;o++){
				Order newOrder = new Order(s.nextInt(),s.nextInt());
				for(int ic = 0;ic<s.nextInt();ic++){
					newOrder.addItem(Universe.products[s.nextInt()]);
				}
			}
		}
	}
}
