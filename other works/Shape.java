package biz;

public abstract class Shape {
	double density;
	abstract double getVolume();
	double getWeight(){
		return getVolume() * density;
	}
	
}
