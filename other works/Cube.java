package biz;

public class Cube extends Shape{

	double edge;
	
	Cube(double e){
		edge = e;
	}
	
	public double getVolume(){
		return edge*edge*edge;
	}
}
