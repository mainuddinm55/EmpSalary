package employees;

public class HourlySalary extends Employee {
	private double totalHour;
	private double hourRate;

	public HourlySalary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlySalary(String empName, String empId, double totalHour, double hourRate) {
		super(empName, empId);
		this.totalHour = totalHour;
		this.hourRate = hourRate;
		// TODO Auto-generated constructor stub
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
		return (totalHour * hourRate);
	}

}
