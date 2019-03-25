package oop972_s4w6_inheritance_university1;
public class Program {
    //courses name: oop-ds-da-db
	public static void main(String[] args) {
		Teacher t1,t2;
		Student s1,s2,s3;
		t1=new Teacher("Vahid", "Seydi", "111", new boolean[]{true,false,false,false});
		t2=new Teacher("Amir", "Rohani", "222", new boolean[]{false,false,false,true});
		s1=new Student("Farhad", "Tavoosian", "333", new double[]{17,-1,-1,-1});
		s2=new Student("Darya", "Azimi", "4444", new double[]{10,15.5,12,12.5});
		s3=new Student("Shayan", "Torangan", "5555", new double[]{12,12,-1,-1});
		System.out.println("finish");

	}

}
