public class EmpWageComputation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static int EMP_RATE_PER_HOUR ;
	public static int NUM_OF_WORKING_DAYS;
	public static int MAX_HRS_IN_MONTH;
	public EmpWageComputation( int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH )	{
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
public static int computeTotalEmpHrs( )	{
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
return totalEmpHrs;

}
public int calTotalEmpWage( int totalEmpHrs )	{
		return totalEmpHrs * EMP_RATE_PER_HOUR;
	}


	public static void main(String args[]) {
		EmpWageComputation companyA = new EmpWageComputation( 20, 20, 100 );
		int totalCompanyAEmpWage = companyA.computerTotalEmpHrs( );
		int totalCompanyAEmpWage = companyA.calTotalEmpWage( companyATotalEmpHrs );
		System.out.println("Total Wage of CompanyA Employee: " + totalCompanyAEmpWage);

		EmpWageComputation B = new EmpWageComputation( 50, 15, 75 );
		int BTotalEmpHrs = B.computeTotalEmpHrs();
		int totalBEmpWage = B.computeTotalEmpHrs( BTotalEmpHrs );
		System.out.println("Total Wage of B Employee: " + totalBEmpWage );


}
}
