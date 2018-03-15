package employees;

public class HourlySalaryWithCommission extends CommssionBasedSalary {

	private double totalHour;
	private double hourRate;

	public HourlySalaryWithCommission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlySalaryWithCommission(String empName, String empId, double growSale, double commissionRate,
			double totalHour, double hourRate) {
		super(empName, empId, growSale, commissionRate);
		// TODO Auto-generated constructor stub
		this.totalHour = totalHour;
		this.hourRate = hourRate;
	}

	public double getTotalHour() {
		return totalHour;
	}

	public void setTotalHour(double totalHour) {
		this.totalHour = totalHour;
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

	@Override
	public double getTotalSalary() {
		// TODO Auto-generated method stub
		return super.getTotalSalary() + (totalHour * hourRate);
	}

}
