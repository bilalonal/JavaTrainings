package biz;

public class TestBag {

	
	public static void main(String[] args) {
		
		Bag b = new Bag();
		Sphere s = new Sphere(5);
		Cube c = new Cube(3);
		Cylinder d = new Cylinder(5,4);
		
		b.addShape(s);
		b.addShape(c);
		b.addShape(d);
	}

	
}
