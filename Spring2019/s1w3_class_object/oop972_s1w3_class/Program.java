package oop972_s1w3_class;

public class Program {

	public static void main(String[] args) {
            Labtop l1,l2;
            l1=new Labtop();
            l2=new Labtop();
            l1.brand="Asus";
            l1.cpu="corei7";
            l1.ram=4;
            l2.brand="Acer";
            l2.cpu="corei3";
            l2.ram=8;
            int r=l1.cpu_compare(l2);
            if(r==0)
            	System.out.println("equal");
            else 
            	if(r==1)
            		System.out.println(l1);
            	else
            		System.out.println(l2);
            	
            
            
	}

}
