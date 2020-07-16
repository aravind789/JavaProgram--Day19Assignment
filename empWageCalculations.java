public class EmpWageComputation {
static int attendence = (int) (Math.floor(Math.random()*10)%2)+1;
	final static int IS_PART_TIME=1;
	final static int IS_FULL_TIME=2;
	final static int WAGE_PER_HOUR=20; 
	static int workHours;
	static int dailyWage;

	public static void main(String[] args) {
		if(attendence == 2 )
			workHours=8;
		else
			workHours=4;
		dailyWage=workHours*WAGE_PER_HOUR;
		System.out.println("Daily Wage of Employee  "+dailyWage);

	}

}
