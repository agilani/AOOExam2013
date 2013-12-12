package gmit;

import java.util.ArrayList;

public abstract class Human {
	
	ArrayList<Roles> roles;
	
	public Human(ArrayList<Roles> roles)
	{
		this.roles = roles;
	}

	public abstract void doTheirThing();

}
