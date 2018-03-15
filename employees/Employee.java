package employees;

public abstract class Employee {
	private String empName;
	private String empId;

	public Employee(String empName, String empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	public Employee() {
		super();
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public abstract double getTotalSalary();
}
