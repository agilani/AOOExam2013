package gmit;

import java.util.ArrayList;
import java.util.Iterator;

public class Scientist extends Worker {

	public Scientist(ArrayList<Roles> roles) {
		super(roles);
		doTheirThing();
	}
	
	@Override
	public void doTheirThing()
	{
		test();
		work();
		
		Iterator<Roles> i = roles.iterator();
		
		while(i.hasNext())
		{
			i.next().doWhatTheyAreSupposeTo();
		}
	}
	
	public void test()
	{
		System.out.print("Scientist is testing");
		
	}

}
