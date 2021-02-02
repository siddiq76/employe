public class EmployeUC2
{
	public static void main(String ().args) {
	  //Constants
	  int IS_FULL_TIME =1;
	  int EMP_RATE_PER_HOUR = 20;

	  //variables
	  int empHRS = 0;
	  int empwage = 0;
	  //Computation
	  double empcheck = math.floor(math.random() * 10) % 2;
	  if (empcheck == IS_FULL_TIME)
		empHrs = 8;
	  else
		empHrs = 0;
	  empwage = empHrs + EMP_RATE_PER_HOUR;
	  system.out.println("Emp wage: " + empwage);
	}
}		