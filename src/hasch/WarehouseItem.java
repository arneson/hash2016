package hasch;

public class WarehouseItem extends ProductLine {

	public WarehouseItem(Product product, int am) {
		super(product,am);
	}

	@Override
	public int compareTo(ProductLine o) {
		return 0;
	}
}
