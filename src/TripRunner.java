import java.util.Scanner;
public class TripRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		GasMileage gas = new GasMileage();
		int miles = 0;
		int gallons = 0;
		while(miles >= 0 )
		{
			System.out.println("Enter miles and then gallons." + "Enter -1 to quit loop.\n");
			miles = input.nextInt();
			gallons = input.nextInt();
			if(miles >= 0)
			{
				gas.addTrip(new Trip(miles, gallons));
				System.out.println((double)miles/gallons);
			}
		}
		System.out.println(gas);
		
		
	}
}
