public class EmpWageComputation {
static int attendence = (int) (Math.floor(Math.random()*10)%3);
	final static int IS_PART_TIME=1;
	final static int IS_FULL_TIME=2;
	final static int WAGE_PER_HOUR=20; 
	static int workHours;
	static int dailyWage;

	public static void main(String[] args) {
		switch(attendence) {
			case IS_FULL_TIME:
				workHours=8;
		break;
			case IS_PART_TIME
				workHours=4;
		break;
			default:
				workHours=0;
		}
		dailyWage=workHours*WAGE_PER_HOUR;
		System.out.println("Daily Wage of Employee  "+dailyWage);

	}

}
