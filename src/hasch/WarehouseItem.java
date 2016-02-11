package hasch;

public class WarehouseItem extends ProductLine {

	public WarehouseItem(Product product, int am) {
		super(product,am);
	}

    @Override
    public int compareTo(ProductLine o) {
        if (this.amount == o.amount)
            return 0;
        else if (this.amount > o.amount)
            return 1;
        else
            return -1;
    }
}
