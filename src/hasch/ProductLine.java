package hasch;

public abstract class ProductLine implements Comparable<ProductLine> {
	Product lineItem;
	int amount;
	public ProductLine(){
		
	}
	public ProductLine(Product p, int amount){
		this.lineItem = p;
		this.amount = amount;
	}

}
