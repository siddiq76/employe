public class EmployeUC6
{
	
	  //Constants
	  public static final int IS_PART_TIME =1;
	  public static final int IS_FULL_TIME =2;
	  public static final int EMP_RATE_PER_HOUR = 20;
	  public static final int NUM_OF_WORKING_DAYS =2;
	  public static final int MAX_HRS_IN_MONTH =10;
	  

	public static void main(String[] args) {
	  //variables
	  int empHRS = 0, empwage = 0, totalEmpwage = 0, totalworkingDays = 0;
	  //Computation
	  int empcheck = (int) math.floor(math.random() * 10) % 3;
	  switch (empcheck) {
	  case IS_FULL_TIME :
		empHrs = 8;
	  case IS_PART_TIME :
		empHrs = 4;
	  break;
	  default :
	  	empHrs = 0;
	   }
	  totalEmpHrs += empHrs;
	  system.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +emHrs);
	}
	int totalEmpwage = totalEmpHrs * EMP_RATE_PER_HOUR;
	system.out.println("Total Emp wage: " + totalEmpwage);
	
	}
}		
