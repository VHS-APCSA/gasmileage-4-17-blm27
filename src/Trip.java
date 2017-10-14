
public class Trip 
{
	private int miles;
	private int gallons;
	private double mpg;
	public Trip()
	{
		this.miles = 0;
		this.gallons = 0;
		this.mpg = 0.0;
	}
	public Trip(int miles, int gallons, double mpg)
	{
		this.miles = miles;
		this.gallons = gallons;
		this. mpg = mpg;
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
	public void setMpg(double mpg)
	{
		this.mpg = mpg;
	}
	public double getMpg()
	{
		return mpg;
	}
	public void mpg()
	{
		mpg = miles/gallons;
	}
}
