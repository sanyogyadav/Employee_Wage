class Wagecomputation {

			// Creating constant to  compare it with random generated value
                	public static final int FULL_TIME = 1;
                        // Craeting another constant for part time value
                        public static final int PART_TIME = 2;
                        // Creating on  more constant for employee rate is fixed
                        public static final int EMP_RATE_PER_HOUR = 20;
			// creating one more constant according to UC5
			public static final int NUM_OF_WORKING_DAYS = 20;
			// creating one more constant for max hours
			public static final int MAX_HRS_IN_MONTH = 100;

        public static void main(String[] args) {

                System.out.println("Welcome to employee wage computation");
                        // Creating Variables
                        int emphrs = 0;
                        int totalwage = 0;
			int totalempwage = 0;
			int totalworkingdays = 0;
			int totalemphrs = 0;

			while (totalemphrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS) {
				totalworkingdays++;
                        //  now generating the random value to compare
			// for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
                        //we are  checking employee is present or absent.
			// type casting the value of double to int here
			int empcheck = (int)Math.floor(Math.random() * 10) % 3;
                        switch (empcheck) {

                                case FULL_TIME:
                                System.out.println("Employee is doing full time");
                                emphrs = 8;

				totalemphrs += emphrs;
                                totalwage = emphrs * EMP_RATE_PER_HOUR;
				System.out.println("Total employee wage : " + totalempwage);
				totalempwage += totalwage;
                                System.out.println("Emp Wage for full day is " + totalwage);
                                break;

                                case PART_TIME:
                                System.out.println("Employee is doing part time");
                                emphrs = 4;
				totalemphrs += emphrs;
                                totalwage = emphrs * EMP_RATE_PER_HOUR;
				System.out.println("Total employee wage : " + totalempwage);
				totalempwage += totalwage;
                                System.out.println("Emp Wage for part time is " + totalwage);
				break;

                                // If nothing matches it will run the default part.
                                default:
                                System.out.println("Employee is absent");
                        	}  //switch
			} // while
	////for	}
        }
}

