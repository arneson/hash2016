package algo;

import hasch.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: algo
 * Author: Joakim
 * Date: 2016-02-11 - 20:52
 * Purpose:
 */
public class Util {


    public static <E> List<E> part(double v, List<E> list){
        int stop = (int) ((list.size()-1)*v);

        return list.subList(0, stop);
    }

    public static List<ProductLine> extractProducts(List<Order> orders){
        List<ProductLine> products = new ArrayList<>();
        for(Order o : orders){
            products.addAll(o.items);
        }

        // TODO Slå samman alla productlinor så det endast finns ett av varje namn (nu finns det flera bananer med olika antal)

        return products;
    }

    public static Drone firstDroneAt(List<Drone> drones, Warehouse warehouse){
        for(Drone d : drones){
            if (warehouse.posX == d.posX && warehouse.posY == d.posY)
                return d;
        }
        return null;
    }

    public static List<Order> ordersWeCanSupply(List<Order> orders, List<ProductLine> products){
        List<Order> suppliedOrders = new ArrayList<>();
        for (Order o : orders){
            if (o.items)
        }
    }

}
