
public class Height {
	
	private int feet,inch;
	
	public Height() {
		this.feet = 0;
		this.inch = 0;
	}

	public Height(int feet, int inch) {
		convertHeight(feet,inch);
	}

	public Height (int inch) {
		convertHeight(0,inch);
	}
	
	
	public int getFeet() {
		return feet;
	}

	public int getInch() {
		return inch;
	}
	
	
	public void convertHeight(int feet, int inch) {
		this.feet= this.feet + this.inch/12;
		this.inch= this.inch%12;
		System.out.println("Height is " + this.feet + " feet & " + this.inch + " inches");
	}
	
	public void addHeight(Height h1) {
		feet = h1.getFeet() + this.feet;
		inch = h1.getInch() + this.inch;
		convertHeight(feet, inch);
	}
	
}
