import java.util.ArrayList;
public class GasMileage
{
	private ArrayList<Trip> gas;
	public GasMileage()
	{
		gas = new ArrayList<Trip>();
	}
	public void addTrip(Trip trip)
	{
		gas.add(trip);
	}
	public double gasMileage()
	{
		int tMiles = 0;
		int tGallons = 0;
		
		for(Trip trip : gas)
		{
			tMiles += trip.getMiles();
			tGallons += trip.getGallons();
		}
		return (double)tMiles/tGallons;
	}
	public void clearTrips()
	{
		int index = 0;
		while(index <gas.size())
		{
			gas.remove(index);
		}
	}
	public
}

