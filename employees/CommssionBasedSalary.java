package employees;

public class CommssionBasedSalary extends Employee {
	private double growSale;
	private double commissionRate;

	public CommssionBasedSalary(String empName, String empId, double growSale, double commissionRate) {
		// TODO Auto-generated constructor stub
		super();
		this.growSale = growSale;
		this.commissionRate = commissionRate;
	}

	public CommssionBasedSalary() {
		// TODO Auto-generated constructor stub
		super();
	}

	public double getGrowSale() {
		return growSale;
	}

	public void setGrowSale(double growSale) {
		this.growSale = growSale;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public double getTotalSalary() {
		// TODO Auto-generated method stub
		return (commissionRate * growSale) / 100;
	}

}
