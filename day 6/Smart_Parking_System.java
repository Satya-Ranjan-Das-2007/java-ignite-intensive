package day6;

public class Smart_Parking_System {

	int vehicleNum;
	int hoursParked;
	String vehicleType;
	double parkingFee;
	
	Smart_Parking_System (int num,int hours,String type)
	{
		vehicleNum = num;
		hoursParked = hours;
		vehicleType = type;
		
		switch(vehicleType)
		{
		case "Bike":
			parkingFee = 10*hoursParked;
			break;
		case "Car":
			parkingFee = 30*hoursParked;
			break;
		case "Bus":
			parkingFee = 50*hoursParked;
			break;
		}
		
	}
	void display()
	{
		System.out.println("Final fee: Rs."+parkingFee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smart_Parking_System vehicle = new Smart_Parking_System(2061,9,"Car");
		vehicle.display();
	}

}
