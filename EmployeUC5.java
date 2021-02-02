public class EmployeUC2
{
	
	  //Constants
	  public static final int IS_PART_TIME =1;
	  public static final int IS_FULL_TIME =2;
	  public static final int EMP_RATE_PER_HOUR = 20;
	  public static final int NUM_OF_WORKING_DAYS =2;

	public static void main(String ().args) {
	  //variables
	  int empHRS = 0;
	  int empwage = 0;
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
	  empwage = empHrs * EMP_RATE_PER_HOUR;
	  totalEMPwage += empwage;
	  system.out.println("Emp wage: " + empwage);
	}
	system.out.println("Total Emp wage: " + totalEmpwage);
	
	}
}		