package thenewbostonAndBook;
import java.util.Random;
public class pythagoras {
	public static void main(String[]args){
		Random gen = new Random();
		
		int num1 = gen.nextInt(300);//1 to 299 
		// 300 range ini gosteriyor. 1 eksigine kadar rastgele sayi uretir.
		int num2 = gen.nextInt(10)+ 1; // 1 to 10
		// range = 10 baslangic sayisi da 1. "+" dan sonraki sayi baslangic sayisini gosteriyor.
		// 1 den 9 a kadar degil dikkat +1 oldugundan 1 den 10 a kadar.
		// normalde parantez icindeki sayinin 1 eksigine kadar rangesi var
		//(10+1 = 11) bu da (11) demek yani rangesi 11-1=10. 1 den 10 a kadar yani.
		int num3 = gen.nextInt(20) - 10; // -10 to 9
		//baslangic noktasi -10. (-10+20)= 10. rangesi 10 demek. 10-1= 9. 9 a kadar sayi uretecek.
		
		
		double num4 = Math.cos(30);
			System.out.println(num4);
			//cos 30 u yaptirdik
		int a,b;	
		
		a = gen.nextInt(8)+2;//2 to 9
		b = gen.nextInt(11)+1;//1 to 11
		
		double aSquare = Math.pow (a,2);
		double bSquare = Math.pow(b,2);
		double c = (int) Math.sqrt(aSquare + bSquare);
		
		c = Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
		
			System.out.println("For a right triangle with sides " + a + " and " + b);
			System.out.println("the hypotenuse is " + c);
	
	}
	
	
	
	
}
