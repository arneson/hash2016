package hasch;

public class Product {
	public int weight;
	public int id;
	public Product(int weight, int id){
		this.weight = weight;
		this.id = id;
	}


	@Override
	public int hashCode(){
		return id*13;
	}
}
