package biz;

public class Sphere extends Shape{
	
	double radius;
	public Sphere(double r) {
		radius = r;
	}
	
	double getVolume(){
		return Math.PI*radius*radius*radius*4f/3;
	}
	
}
