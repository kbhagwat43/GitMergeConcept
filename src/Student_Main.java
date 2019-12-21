
public class Student_Main {

	public static void main(String[] args) 
	{
		Student s1= new Student();
		s1.student_M(101,"Sachin","Wankhade");
		Address ad= s1.address();
		ad.Address_M("A56","Raje Sambhaji Nager.", "Near Ganpati Mandir.");
		State st1= s1.state();
		st1.state("Maharashtra", "Karanja Lad");
		

	}

}
