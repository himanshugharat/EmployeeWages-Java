public class EmpWageComputation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static int MAX_NUM_OF_WORKING_DAYS;
	public static String COMPANY_NAME;
	public static int EMP_RATE_PER_HOUR ;
	public static int MAX_HRS_IN_MONTH;
	public EmpWageComputation( int EMP_RATE_PER_HOUR, int MAX_ NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH )	{
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.MAX_NUM_OF_WORKING_DAYS = MAx_NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
	public static String getCompanyName()	{
		return COMPANY_NAME;
	}

	public static int getEmpRatePerHour()	{
		return EMP_RATE_PER_HOUR;
	}

	public static int getMaxNumOfWorkingDays()	{
		return MAX_NUM_OF_WORKING_DAYS;
	}

	public static int getMaxHrsInMonth()	{
		return MAX_HRS_IN_MONTH;
	}

	public static int getTotalEmpWage()	{
		return TOTAL_EMP_WAGE;
	}


public static void computeTotalEmpWage( )	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		int empCheck = (int) ( Math.random() * 10 ) % 2;
		while ( totalEmpHrs <= getMaxHrsInMonth &&
					totalWorkingDays < getNumOfWorkingDays )	{
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
		TOTAL_EMP_WAGE = totalEmpHrs * getEmpRatePerHour();
		System.out.println("Total Wage of " + getCompanyName() + " Employee is " + getTotalEmpWage());

}


	public static void main(String args[]) {
		EmpWageComputation companyA = new EmpWageComputation( 20, 20, 100 );
		companyA.computerTotalEmpHrs( );

		EmpWageComputation B = new EmpWageComputation( 50, 15, 75 );
		B.computeTotalEmpHrs();

}
}
