package gmit;

import java.util.ArrayList;
import java.util.Iterator;

public class Student extends Human{
	
	 public Student(ArrayList<Roles> roles)
	 {
		 super(roles);
		 doTheirThing();
	 }
	 
	@Override
	public void doTheirThing()
	{
		study();
		Iterator<Roles> i = roles.iterator();
		
		while(i.hasNext())
		{
			i.next().doWhatTheyAreSupposeTo();
		}
	}
	
	public void study()
	{
		System.out.print("Student is studying and ");
	}
}
