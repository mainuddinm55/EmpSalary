package employees;

public class BaseSalary extends Employee {

	private double baseSalary;

	public BaseSalary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseSalary(String empName, String empId, double baseSalary) {
		super(empName, empId);
		this.baseSalary = baseSalary;
		// TODO Auto-generated constructor stub
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double getTotalSalary() {
		// TODO Auto-generated method stub
		return baseSalary;
	}

}
