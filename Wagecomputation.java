class Wagecomputation {

			// Creating constant to  compare it with random generated value
                	public static final int FULL_TIME = 1;
                        // Craeting another constant for part time value
                        public static final int PART_TIME = 2;
                        // Creating on  more constant for employee rate is fixed
                        public static final int EMP_RATE_PER_HOUR = 20;

        public static void main(String[] args) {

                System.out.println("Welcome to employee wage computation");
                        // Creating Variables
                        int emphrs = 0;
                        int totalwage = 0;
                        //  now generating the random value to compare
			// type casting the value of double to int here
                        double empcheck = Math.floor(Math.random() * 10) % 3;
                        // double used for random() as it generates decimal value.
                        //we are  checking employee is present or absent.
                        switch ((int)empcheck) {

                                case FULL_TIME:
                                System.out.println("Employee is doing full time");
                                emphrs = 8;
                                totalwage = emphrs * EMP_RATE_PER_HOUR;
                                System.out.println("Emp Wage for full day is " + totalwage);
                                break;

                                case PART_TIME:
                                System.out.println("Employee is doing part time");
                                emphrs = 4;
                                totalwage = emphrs * EMP_RATE_PER_HOUR;
                                System.out.println("Emp Wage for part time is " + totalwage);
				break;

                                // If nothing matches it will run the default part.
                                default:
                                System.out.println("Employee is absent");
                        }
        }
}
