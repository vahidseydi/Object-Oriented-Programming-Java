package oop972_s4w6_inheritance_university1;

public class Person {
	protected String name;
	protected String last_name;
	protected String code;
	public Person(String name,String last_name,	String code){
		set_name(name);
		set_lastName(last_name);
		set_code(code);
	}
	private void set_code(String code) {
		this.code=code;
	}
	private void set_lastName(String last_name) {
		this.last_name=last_name;
	}
	private void set_name(String name) {
		this.name=name;		
	}
}
class Student extends Person{
    double [] scores;
	public Student(String name, String last_name, String code,double [] scores) {
		super(name, last_name, code);
		this.scores=new double[4];
		set_scores(scores);
	}
	private void set_scores(double[] scores) {
		for(int i=0;i<scores.length;i++)
			this.scores[i]=scores[i];		
	}	
}
class Teacher extends Person{
    boolean [] courses;
	public Teacher(String name, String last_name, String code,boolean [] courses) {
		super(name, last_name, code);
		this.courses=new boolean[4];
		set_courses(courses);
	}
	private void set_courses(boolean[] courses) {
		for(int i=0;i<courses.length;i++)
			this.courses[i]=courses[i];		
	}	
}
