
public class Employee {
	
	private String empName;
	private int empId;
	private int empAge;
	private String empdesgn;
	private String empLocation;
	private int empExpInYrs;
	
	public Employee(String empName) {
	
		this.empName = empName;
	}

	public Employee(String empName, int empId) {
	
		this.empName = empName;
		this.empId = empId;
	}

	public Employee(String empName, int empId, int empAge) {
	
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
	}

	public Employee(String empName, int empId, String empdesgn) {
	
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
	}

	public Employee(String empName, int empId, int empAge, String empdesgn) {
	
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = empdesgn;
	}

	public Employee(String empName, int empId, int empAge, String empLocation) {
	
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empLocation = empLocation;
	}

	public Employee(String empName, int empId, int empAge, int empExpInYrs) {

		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, String empdesgn, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, String empdesgn, String empLocation, int empExpInYrs) {

		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, int empAge, String empdesgn, String empLocation, int empExpInYrs) {

		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

}
