package gmit;

public class GalaxianPlayer implements Roles {

	@Override
	public void doWhatTheyAreSupposeTo() {
		// TODO Auto-generated method stub
		pay();
		play();
	}
	
	public void pay()
	{
		System.out.print(" Pay in Galaxian");
	}
	
	public void play()
	{
		System.out.print(" Play Galaxian");
	}
}
