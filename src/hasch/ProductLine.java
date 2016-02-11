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

	public int getAmount(){
		return amount;
	}
	public Product getProduct(){
		return lineItem;
	}
	public void increase(int amount) {
		this.amount +=amount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lineItem == null) ? 0 : lineItem.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductLine other = (ProductLine) obj;
		if (lineItem == null) {
			if (other.lineItem != null)
				return false;
		} else if (!lineItem.equals(other.lineItem))
			return false;
		return true;
	}
	
}
