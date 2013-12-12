package gmit;

import java.util.ArrayList;
import java.util.Iterator;

public class Lawyer extends Worker {

	public Lawyer(ArrayList<Roles> roles) {
		super(roles);
		doTheirThing();
	}
	
	@Override
	public void doTheirThing()
	{
		represent();
		work();
		
		Iterator<Roles> i = roles.iterator();
		
		while(i.hasNext())
		{
			i.next().doWhatTheyAreSupposeTo();
		}
	}
	
	public void represent()
	{
		System.out.print("Lawyer is representing");
	}

}
