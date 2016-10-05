package biz;

public class Cylinder extends Shape{
	
	double radius, height;
	public Cylinder(double radius, double height){
		this.radius=radius;
		this.height=height;
	}
	
	double getVolume(){
		return Math.PI*radius*radius*height;
	}
	
}
