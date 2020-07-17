interface WageMethod	{

	public void computeTotalEmpWage( CompanyEmpWage obj );

}
public class EmpWageComputation implements WageMethod {
	public final int IS_PART_TIME = 1;
	public final int IS_FULL_TIME = 2;

public void computeTotalEmpWage( CompanyEmpWage companyEmployee )	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		int empCheck = (int) ( Math.random() * 10 ) % 2;
		while ( totalEmpHrs <= companyEmployee.getMaxHrsInMonth &&
					totalWorkingDays < companyEmployee.getNumOfWorkingDays )	{
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
		companyEmployee.setTotalEmpWage = totalEmpHrs * companyEmployee.getEmpRatePerHour();
		System.out.println("Total Wage of " + companyEmployee.getCompanyName() + " Employee is " + companyEmployee.getTotalEmpWage());

}


	public static void main(String args[]) {
		CompanyEmpWage[] company = new CompanyEmpWage[2];
		company[0] = new CompanyEmpWage( "CompanyA", 20, 20, 100 );
		empwagecomputation.computeTotalEmpWage(company[0]);
		company[1] = new CompanyEmpWage( "CompanyB", 30, 20, 70 );
		empwagecomputation.computeTotalEmpWage(company[1]);
}
}
class CompanyEmpWage	{

	public String COMPANY_NAME;
	public int EMP_RATE_PER_HOUR;
	public int MAX_NUM_OF_WORKING_DAYS;
	public int MAX_HRS_IN_MONTH;

	public int totalEmpWage = 0;
	//CONSTRUCTOR
	public CompanyEmpWage( String COMPANY_NAME, int EMP_RATE_PER_HOUR, int MAX_NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH )	{
		this.COMPANY_NAME = COMPANY_NAME;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.MAX_NUM_OF_WORKING_DAYS = MAX_NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
	//GETTERS
	public String getCompanyName()	{
		return COMPANY_NAME;
	}
	public int getEmpRatePerHour()	{
		return EMP_RATE_PER_HOUR;
	}

	public int getMaxNumOfWorkingDays()	{
		return MAX_NUM_OF_WORKING_DAYS;
	}

	public int getMaxHrsInMonth()	{
		return MAX_HRS_IN_MONTH;
	}

	public void setTotalEmpWage( int totalEmpWage )	{
		this.totalEmpWage = totalEmpWage;
	}

	public int getTotalEmpWage()  {
		return totalEmpWage;
   }
}
