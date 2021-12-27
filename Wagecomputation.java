class Wagecomputation {

        public static void main(String[] args) {

                System.out.println("Welcome to employee wage computation");

                        // Creating constant to  compare it with random generated value
                        int FULL_TIME = 1;
			// Craeting another constant for part time value
			int PART_TIME = 2;
                        // Creating on  more constant for employee rate is fixed
                        int EMP_RATE_PER_HOUR = 20;
                        // Creating Variables
                        int emphrs = 0;
                        int totalwage = 0;
                        //  now generating the random value to compare
                        double empcheck = Math.floor(Math.random() * 10) % 3;
                        // double used for random() as it generates decimal value.
                        //we are  checking employee is present or absent.
                        if (empcheck == FULL_TIME)
                              {  System.out.println("Employee is Present");
                                emphrs = 8;
                                totalwage = emphrs * EMP_RATE_PER_HOUR;
                                System.out.println("Emp Wage for full day is " + totalwage);
			}
			else if (empcheck == PART_TIME)
                              {
			        System.out.println("Employee is doing part time");
                                emphrs = 4;
                                totalwage = emphrs * EMP_RATE_PER_HOUR;
                                System.out.println("Emp Wage for part time is " + totalwage);
			}
			else
				System.out.println("Employee is absent");
	}
}
