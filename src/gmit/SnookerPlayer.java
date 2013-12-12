package gmit;

public class SnookerPlayer implements Roles {

	@Override
	public void doWhatTheyAreSupposeTo() {
		// TODO Auto-generated method stub
		play();
		rack();
	}

	public void play()
	{
		System.out.print(" Plays snooker");
	}
	
	public void rack()
	{
		System.out.print(" Rack the balls");
	}
	
}
