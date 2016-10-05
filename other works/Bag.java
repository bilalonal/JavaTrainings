package biz;

public class Bag {

	double volume;
	double weight;
	
	void addShape(Shape s){
		volume += s.getVolume();
		weight += s.getWeight();
	}
}
