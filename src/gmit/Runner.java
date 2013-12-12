package gmit;

import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Roles> human1Roles = new ArrayList<Roles>();
		human1Roles.add(new PokerPlayer());
		human1Roles.add(new SnookerPlayer());
		Human human1 = new Scientist(human1Roles);
		
		System.out.println("\r\n");
		
		ArrayList<Roles> human2Roles = new ArrayList<Roles>();
		human2Roles.add(new GalaxianPlayer());
		human2Roles.add(new StampCollector());
		Human human2 = new Lawyer(human2Roles);		
		
		
		System.out.println("\r\n");
		
		ArrayList<Roles> human3Roles = new ArrayList<Roles>();
		human3Roles.add(new GalaxianPlayer());
		human3Roles.add(new StampCollector());
		Human human3 = new Artisan(human3Roles);		

		
		System.out.println("\r\n");
		
		ArrayList<Roles> human4Roles = new ArrayList<Roles>();
		human4Roles.add(new GalaxianPlayer());
		human4Roles.add(new StampCollector());
		Human human4 = new Student(human4Roles);
		
		
		
		
		
	}
}
