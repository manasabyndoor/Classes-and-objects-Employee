import java.util.Scanner;

public class EployeeTestClass {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		String Name;
		// to read input from user
		System.out.println("Enter employee id");
		employee1.id = scanner.nextInt();

		System.out.println("Enter employee name");
		Name = scanner.nextLine();

		System.out.println("Enter employee monthly basic");
		employee1.monthlyBasic = scanner.nextDouble();

		employee1.setMonthlyBasic(employee1.monthlyBasic);
		double annual = employee1.getAnnualBasic();// calling annualbasic function
		System.out.println("annual=" + annual);
		System.out.println("MonthlyGrossSalary=" + employee1.getMonthlyGrossSalary());
		System.out.println("MonthlyDeduction=" + employee1.getMonthlyDeductions());
		System.out.println("Monthly take homw=" + employee1.getMonthlyTakeHome());
		System.out.println("Annual take home" + employee1.getAnnualTakeHome());

	}
}
