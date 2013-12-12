package gmit;

import java.util.ArrayList;
import java.util.Iterator;

public class Artisan extends Worker {

	public Artisan(ArrayList<Roles> roles) {
		super(roles);
		doTheirThing();
	}
	
	@Override
	public void doTheirThing()
	{
		build();
		work();
		
		Iterator<Roles> i = roles.iterator();
		
		while(i.hasNext())
		{
			i.next().doWhatTheyAreSupposeTo();
		}
	}
	
	public void build()
	{
		System.out.print("Artisan is building");
	}

}
