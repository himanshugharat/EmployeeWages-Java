public class EmpWageComputation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;
public static int calTotalEmpWage( int totalEmpHrs )	{
		return totalEmpHrs * EMP_RATE_PER_HOUR;
	}
	public static void main(String args[]) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		int empCheck = (int) ( Math.random() * 10 ) % 2;
		while ( totalEmpHrs <= MAX_HRS_IN_MONTH &&
					totalWorkingDays < NUM_OF_WORKING_DAYS )	{
			totalWorkingDays++;
		switch (empCheck)	{
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +  empHrs);


}
int totalEmpWage = calTotalEmpWage( totalEmpHrs );
System.out.println("Total Emp Wage: " + totalEmpWage);
}
}
