
public class GetEggs {
	
	private int n, gross, dozen, rem;
	
	

	public int getN() {
		return n;
	}

	public int setN(int n) {
		return n;
	}
	
	public int getGross() {
		return gross;
	}

	public void setGross(int gross) {
		this.gross = gross;
	}

	public int getDozen() {
		return dozen;
	}

	public void setDozen(int dozen) {
		this.dozen = dozen;
	}

	public int getRem() {
		return rem;
	}

	public void setRem(int rem) {
		this.rem = rem;
	}
	
	public void display() {
		System.out.println("Gross     : " + getGross());
		System.out.println("Dozen     : " + getDozen());
		System.out.println("Remaining : " + getRem());
	}
	
	
	
	
	
}
