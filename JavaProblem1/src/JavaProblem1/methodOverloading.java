package JavaProblem1;

public class methodOverloading {
	
	int add(int x, int y) { //with 2 parameters
		return x+y;
	}
	int add(int x, int y, int z) { // with 3 parameters
		return x+y+z;
	}
	int add(int w, int x, int y, int z) { // with 4 parameters
		return x+y+z+w;
	}
	double add(double x, double y) { //with different data type
		return x+y;
	}
	
	public static void main(String [] args) {
		methodOverloading obj = new methodOverloading();
		System.out.println("sum is : "+obj.add(7, 3));
		System.out.println("sum is :" + obj.add(2, 3, 7));
		System.out.println("sum is :" +obj.add(6, 6,4,4));
		System.out.println(obj.add(4.0, 7));
	}
}
