package hasch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class main {
	public static void main(String[] args){
		Scanner s;
		try {
			s = new Scanner(new FileReader("/Users/simonarneson/Documents/workspace/hasch/src/hasch/busy_day.in"));
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
				String[] productsData = s.nextLine().split(" ");
				for(int i = 0; i<productsData.length;i++){
					Universe.products[i] = (new Product(i,Integer.parseInt(productsData[i])));
				}
				int numberOfWarehouses = Integer.parseInt(s.nextLine());
				Universe.warehouses = new Warehouse[numberOfWarehouses];
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
					Universe.warehouses[v] = w;
				}
				int numberOfOrders = Integer.parseInt(s.nextLine());
				Universe.orders = new Order[numberOfOrders];
				for (int o = 0; o<numberOfOrders;o++){
					String[] pos = s.nextLine().split(" ");
					Order newOrder = new Order(Integer.parseInt(pos[0]),Integer.parseInt(pos[1]));
					int numberOfProductsInOrder = Integer.parseInt(s.nextLine());
					String[] orderProductsData = s.nextLine().split(" ");
					for(int ic = 0;ic<numberOfProductsInOrder;ic++){
						newOrder.addItem(Universe.products[Integer.parseInt(orderProductsData[ic])]);
					}
					Universe.orders[o] = newOrder;
				}
			}
			s.close();
			Product[] p = Universe.products;
			Order[] o = Universe.orders;
			for(int d = 0; d<Universe.NUMBER_OF_DRONES;d++){
				Universe.drones.add(new Drone());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int maxProduct = 0;

	}
}


