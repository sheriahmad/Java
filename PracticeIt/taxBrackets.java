public class taxBrackets {

	public static void main(String[] args) {

		double hello = tax(50000.00);
		System.out.println(hello);

	}

	public static double tax(double salary) {

		double tax = 0.0;

		if (salary <= 7150) {
			tax = salary * 0.1;
		}

		if (salary <= 29050 && salary > 750) {
			tax = (salary - 7150) * 0.15 + 715;
		}

		if (salary <= 70350 && salary > 29050) {
			tax = (salary - 29050) * 0.25 + 4000;

		}
		if (salary > 70350){
			tax = ((salary - 70350) * 0.28 + 14325);

		}

		return tax;
	}
}
