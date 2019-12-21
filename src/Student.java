
public class Student 
{
	private int id;
	private String fname;
	private String lname;
	private Address add;
	private State s;
	
	//Address a1= new Address();
	//City c1= new City();
	
	public Address address()
	{
		Address ad1= new Address();
		return ad1;
				
	}

	public State state()
	{
		State s1= new State();
		return s1;
	}
	
	public void student_M(int id,String fname,String lname) 
	{
		this.id=id;
		this.fname=fname;
		this.lname=lname;
				
		System.out.println("Student Personal Details is...");
		System.out.println("Id: "+id);
		System.out.println("First Name: "+fname);
		System.out.println("Last Name: "+lname);
			
	}
}
