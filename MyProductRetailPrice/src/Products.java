
public class Products {
	private double p1 = 22.50;
	private double p2 = 44.50;
	private double p3 = 9.98;
	private double totalPrice;
	
	public double getProduct1() {
		// TODO Auto-generated method stub
		return p1;
	}
	
	public double getProduct2() {
		// TODO Auto-generated method stub
		return p2;
	}
	
	public double getProduct3() {
		// TODO Auto-generated method stub
		return p3;
	}	
	
	public void addToTotal(double d) {
		// TODO Auto-generated method stub
		this.totalPrice +=  d;
	}
	
	public double totalValue() {
		return totalPrice;
	}
}
