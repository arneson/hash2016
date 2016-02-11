package hasch;

public class Product {
	public int weight;
	public int id;
	public Product(int weight, int id){
		this.weight = weight;
		this.id = id;
	}


	@Override
	public int hashCode() {
		return id * 13;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}
}
