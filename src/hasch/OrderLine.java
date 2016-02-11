package hasch;

public class OrderLine extends ProductLine{

    public OrderLine(Product p, int i) {
        super(p,i);
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
