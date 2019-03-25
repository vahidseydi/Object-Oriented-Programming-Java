package oop972_s2w4_constructors;

public class Program {

	public static void main(String[] args) {
		Student s1,s2;
		s1=new Student("Vahid","Seydi",18.36);
		s2=new Student("Amir","Rohani",18.36);
		s1.avg=12.23;// there is not Encapsulation
		int r=s1.compare_avg(s2);		
		if(r==1)
			System.out.println(s1);
		else if(r==-1)
			System.out.println(s2);
		else
			System.out.println(s1 +" and "+s2+" are equal.");

	}
	

}
