
public class ProcessEggs {
	
	private int n;
	
	public ProcessEggs(int n) {
		this.n=n;
	}
	
	public GetEggs convert() {
		GetEggs gEggs = new GetEggs();
		int gross = n/144;
		n=n%144;
		int dozen = n/12;
		int rem = n%12;
		gEggs.setGross(gross);
		gEggs.setDozen(dozen);
		gEggs.setRem(rem);
		return gEggs;
	}
	
}
