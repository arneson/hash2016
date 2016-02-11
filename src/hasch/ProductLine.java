package hasch;

public abstract class ProductLine {
	private Product lineItem;
	private int amount;
	public ProductLine(){
		
	}
	public ProductLine(Product p, int amount){
		this.lineItem = p;
		this.amount = amount;
	}
	public int getAmount(){
		return amount;
	}
	public Product getProduct(){
		return lineItem;
	}
	public void increase(int amount) {
		this.amount +=amount;
	}
}
