package oop972_s1w3_class;

public class Labtop {
	String brand;
	String cpu;
	int ram;
	int cpu_compare(Labtop l){
		if(this.cpu=="corei3"){
			switch(l.cpu){
				case "corei3":return 0;
				case "corei5":return -1;
				case "corei7":return -1;				
			}
		}
		if(this.cpu=="corei5"){
			switch(l.cpu){
				case "corei3":return 1;
				case "corei5":return 0;
				case "corei7":return -1;				
			}
		}
		if(this.cpu=="corei7"){
			switch(l.cpu){
				case "corei3":return 1;
				case "corei5":return 1;
				case "corei7":return 0;				
			}
		}
		return 0;//incorrect
	}
	@Override
	public String toString(){
		return this.brand+","+this.cpu+","+this.ram;
	}
}
