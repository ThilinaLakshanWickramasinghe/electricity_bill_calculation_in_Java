import java.util.Scanner;
public class Main
{
	public static void main(String[]args)
	{
		Scanner objScan = new Scanner(System.in);

		System.out.print("Enter Your Name = ");
		String namee = objScan.nextLine();

		System.out.print("Enter Your Address = ");
		String address = objScan.nextLine();

		System.out.print("Enter Month = ");
		String month = objScan.nextLine();

		System.out.print("Enter Your Bill Number = ");
		int bill = objScan.nextInt();
	
			System.out.print("Enter Your This Month Reading (Units) = ");
			int reading1 = objScan.nextInt();

			System.out.print("Enter Your Last Month Reading (Units) = ");
			int reading2 = objScan.nextInt();

			int reading = reading1- reading2 ;

		Calculation objCal = new Calculation();

		objCal.cal(reading);

	}
}