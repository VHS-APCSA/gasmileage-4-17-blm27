# Gas-Mileage-4.17
Solve a modified version of problem 4.17.

Make a Trip class that has an int miles and an int gallons. 
Complete the full class (two constructors, get/set methods.)
Add a method that returns the miles per gallon as a double.

Make a GasMileage class that has an ArrayList that stores Trip objects. 
Include a single constructor and an addTrip() method.
Add a gasMileage method that returns the total miles over the total gallons for all the trips in the list as a double.
Add a clearTrips method that uses a while() loop to remove all Trips from the list.

Make a Runner that uses a Scanner to take input in a while loop to create new trips and add them to the list 
until the user enters a sentinel value.
Every time a new Trip object is created the runner should print out the miles/gallon for that trip.
When the user is finished adding trips the gas mileage for the list of trips should be printed out.
Once the total gas mileage is printed, clear the list.
