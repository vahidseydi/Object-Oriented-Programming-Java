package oop972_s2w4_constructors;

public class Student {
	String name;
	String lastname;
	double avg;
	public Student(String name,String lname,double avg){
		this.name=name;
		this.lastname=lname;
		this.avg=avg;		
	}
	public int compare_avg(Student s){
		if(this.avg>s.avg)
			return 1;
		else if(this.avg<s.avg)
			return -1;
		return 0;
	}
	@Override
	public  String  toString(){
		return this.name+" "+this.lastname+":"+this.avg;
	}

}
