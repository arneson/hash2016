package algo;

import hasch.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Package: algo
 * Author: Joakim
 * Date: 2016-02-11 - 20:22
 * Purpose:
 */
public class Algo {

    // Take in data
    // Sort orders with the order with least amount of products first
    // While not done
        // Get the first orders to process 33 33 33 1
        // Combine products into a sorted list with most common product first
        // While not done with products
            // Cycle through warehouses with drones
                // Take as many products as we can from list
                // Calculate which locations we can supply with these products
                // Calculate dijkstra path among the locations with a warehouse as ending
                // Calculate best = #products/pathLength
            // Take the choice with smallest best
            // Send that drone (decrease necessary values)

    List<Drone> drones;
    List<Order> orders;
    List<Warehouse> warehouses;

    void easyHandle(){
        StringBuilder sb = new StringBuilder();

        Order order = orders.get(0);
        Warehouse warehouse = warehouses.get(0);


        int droneid = 0;
        for (Drone drone : drones){
            int weight = Universe.MAX_LOAD;
            for (OrderLine line : order.items){
                if (line.amount * line.lineItem.weight > weight){

                }else{
                    sb.append(droneid + " L " + line.amount + " " + line.lineItem.id + " " + Universe.)
                }

            }

            droneid++;
        }
        sb.append()
    }

    void handle(){
        Collections.sort(orders);

        while(true) {
            List<Order> current = Util.part(0.33, orders);
            List<ProductLine> products = Util.extractProducts(current);
            Collections.sort(products);

            while (true) {
                for(Warehouse warehouse : warehouses) {
                    Drone drone = Util.firstDroneAt(drones, warehouse);
                    if (drone != null){
                        // Drone at the warehouse
                        List<ProductLine> productsAtWarehouse = warehouse.hasProducts(products);
                        if (productsAtWarehouse.size() > 0){
                            //  work to do

                        }
                    }
                }
            }
        }
    }





}
