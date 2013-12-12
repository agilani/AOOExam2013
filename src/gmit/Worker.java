package gmit;

import java.util.ArrayList;

public abstract class Worker extends Human {
	
	public Worker(ArrayList<Roles> roles)
	{
		super(roles);
	}
	
	@Override
	public void doTheirThing()
	{
		work();
	}
	
	public void work()
	{
		System.out.print(" and working and");
	}
}
