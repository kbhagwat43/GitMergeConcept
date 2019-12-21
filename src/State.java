
public class State
{
	private String city;
	private String state;
	
	
	public void state(String state,String city)
	{
		this.city=city;
		this.state=state;
		
		
		System.out.println("City: "+city);
		System.out.println("State: "+state);
	}
}
