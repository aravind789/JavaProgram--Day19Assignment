class Attendance{
	final static int IS_PART_TIME=1;
	final static int IS_FULL_TIME=2;
	int workHours;
	public int getWorkHours(int attendence){
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
		return workHours;

	}

}
public class EmpWageComputation {
	final static int TOTAL_WORKING_DAYS=20;
	final static int WAGE_PER_HOUR=20; 
	static int attendence;
	static int oneDayWorkHours;
	static int dailyWage;
	static int totalWagesPerMonth=0;
	static int workingDays=0;
	public static void main(String[] args) {

		Attendance hrs = new Attendance();
		while(workingDays<=TOTAL_WORKING_DAYS)
		{
			workingDays++;
			attendence = (int) (Math.floor(Math.random()*10))%3;
			oneDayWorkHours=hrs.getWorkHours(attendence);
			dailyWage=oneDayWorkHours*WAGE_PER_HOUR;
			totalWagesPerMonth+=dailyWage;
			System.out.println("DailyWage on "+workingDays+" th Day= "+dailyWage);
		}
		System.out.println("Total Wages Per Month= "+totalWagesPerMonth);

	}

}

