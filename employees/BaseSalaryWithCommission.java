package employees;

public class BaseSalaryWithCommission extends CommssionBasedSalary {

	private double baseSalary;

	public BaseSalaryWithCommission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseSalaryWithCommission(String empName, String empId, double growSale, double commissionRate,
			double baseSalary) {
		super(empName, empId, growSale, commissionRate);
		// TODO Auto-generated constructor stub
		this.baseSalary = baseSalary;
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
		return super.getTotalSalary() + baseSalary;
	}

}
