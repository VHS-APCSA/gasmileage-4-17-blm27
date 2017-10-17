
public class Trip 
{
	private int miles;
	private int gallons;
	public Trip()
	{
		this.miles = 0;
		this.gallons = 0;
	}
	public Trip(int miles, int gallons)
	{
		this.miles = miles;
		this.gallons = gallons;
	}
	public void setMiles(int miles)
	{
		this.miles = miles;
	}
	public int getMiles()
	{
		return miles;
	}
	public void setGallons(int gallons)
	{
		this.gallons = gallons;
	}
	public int getGallons()
	{
		return gallons;
	}
	public double mpg()
	{
		double mpg = (double)miles/gallons;
		return mpg;
	}
}
