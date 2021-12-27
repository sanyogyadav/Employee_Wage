class Wagecomputation {

	public static void main(String[] args) {

		System.out.println("Welcome to employee wage computation");

			// Creating constant to  compare it with random generated value
			int FULL_TIME = 1;
			//  now generating the random value to compare
			double empcheck = Math.floor(Math.random() * 10) % 2;
			// double used for random() as it generates decimal value.
			//we are  checking employee is present or absent.
			if (empcheck == FULL_TIME)
				System.out.println("Employee is Present");
			else
				System.out.println("Employee is Absent");
	}
}