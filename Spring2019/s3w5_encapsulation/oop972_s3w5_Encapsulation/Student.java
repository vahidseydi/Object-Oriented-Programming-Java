package oop972_s3w5_Encapsulation;

public class Student {
	private String name;
	private String lastname;
	private double avg;
	public Student(String name,String lname,double avg){
		this.setName(name);
		this.lastname=lname;
		this.setAvg(avg);		
	}
	public int compare_avg(Student s){
		if(this.getAvg()>s.getAvg())
			return 1;
		else if(this.getAvg()<s.getAvg())
			return -1;
		return 0;
	}
	@Override
	public  String  toString(){
		return this.getName()+" "+this.lastname+":"+this.getAvg();
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		if(avg>=0 && avg <=20)
			this.avg = avg;
		else
			System.out.println("avg is incorrect.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
