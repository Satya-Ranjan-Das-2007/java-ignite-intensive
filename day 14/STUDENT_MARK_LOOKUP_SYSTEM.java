package JAVA_DAY_14;
import java.util.HashSet;
public class STUDENT_MARK_LOOKUP_SYSTEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generating hashset named participants
		HashSet<String> participants = new HashSet<>();
		//adding participants in it
		participants.add("STWATRA");
		participants.add("SUBHENDU");
		participants.add("BALDEV");
		participants.add("HRUSHIKESH");
		participants.add("GURUDUTTA");
		participants.add("SUBHAM");
		participants.add("SATYA");
		participants.add("ROHIT");
		participants.add("ASHU");
		participants.add("TANMAY");
		participants.add("ARYAN");
		participants.add("SREETI");
		participants.add("ARPITA");
		
		//Displaying all the registered participants
		System.out.println("Registered participants: "+ participants);
		
		//Displaying total no. of participants registered
		System.out.println("Total no. of registered participants: "+participants.size());
		
		}

}