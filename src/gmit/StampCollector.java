package gmit;

public class StampCollector implements Roles {

	@Override
	public void doWhatTheyAreSupposeTo() {
		// TODO Auto-generated method stub
		collect();
		review();
	}
	
	public void collect()
	{
		System.out.print(" Collect Stamps");
	}
	
	public void review()
	{
		System.out.print(" Review stamps");
	}

}
