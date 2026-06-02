package day6;

public class FLIGHT_DETAILS {
	String passengerName;
	String passengerId;
	String Destination;
	int age;
	int hours_journey;
	
	 FLIGHT_DETAILS(String pn,String pId,String d,int a,int h)
	{
	passengerName = pn;
	passengerId = pId;
	Destination = d;
	age = a;
	hours_journey = h;
	}
	void display()
	{
		System.out.println("Passenger Name: " +passengerName);
		System.out.println("Passenger Id: " +passengerId);
		System.out.println("Destination: " +Destination);
		System.out.println("Age: " +age);
		System.out.println("Hours of Journey: " +hours_journey);
		System.out.println("------------------------------");
		
	}
	public static void main(String[] args) {
		FLIGHT_DETAILS p1 = new FLIGHT_DETAILS("STWATRA KRUSHNA MANGARAJ","25bcsh53","NEWYORK",19,24);
		FLIGHT_DETAILS p2 = new FLIGHT_DETAILS("SUBHENDU PARIDA","25bcsd37","POLAND",18,12);
		FLIGHT_DETAILS p3 = new FLIGHT_DETAILS("BALDEV SAHOO","25bcsb26","NORWAY",19,14);
		FLIGHT_DETAILS p4 = new FLIGHT_DETAILS("HRUSHIKESH SAHOO","25bcsd11","NIGERIA",19,20);
		FLIGHT_DETAILS p5 = new FLIGHT_DETAILS("NIGGAJIT MALLIK","25becb43","ETHOPIA",20,8);
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
	}
}

