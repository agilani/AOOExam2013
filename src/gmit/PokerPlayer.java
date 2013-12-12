package gmit;

public class PokerPlayer implements Roles {

	@Override
	public void doWhatTheyAreSupposeTo() {
		// TODO Auto-generated method stub
		play();
		deal();
	}
	
	public void play()
	{
		System.out.print(" Plays Poker");
	}

	public void deal()
	{
		System.out.print(" Deal Cards");
	}
}
