package employees;

public class StartPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new CommssionBasedSalary("Mainuddin", "emp-222", 200000, 20);
		Employee employee2 = new BaseSalary("Kamal", "emp-202", 15000);
		Employee employee3 = new HourlySalary("Hanif", "emp-303", 260, 69);
		Employee employee4 = new BaseSalaryWithCommission("Dadon", "emp-305", 250000, 16, 18000);
		Employee employee5 = new HourlySalaryWithCommission("Hasan", "emp-365", 150000, 10, 156, 50);

		System.out.println(employee.getTotalSalary());
		System.out.println(employee2.getTotalSalary());
		System.out.println(employee3.getTotalSalary());
		System.out.println(employee4.getTotalSalary());
		System.out.println(employee5.getTotalSalary());

	}

}
