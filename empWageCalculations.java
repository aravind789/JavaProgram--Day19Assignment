public class EmpWageComputation {

	public static void main(String[] args) {
		int attendence = (int) Math.floor(Math.random()*10)%2;
		if(attendence == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

	}

}
