package JavaProblem1;

//import com.sun.java_cup.internal.runtime.Scanner;
import java.util.Scanner;

//constructors in java
public class constructorExample {
	int num;
	constructorExample(){ //Default Constructor
		num = 5;
		System.out.println("Default Constructor called");
	}
	//Parameterized Constructor
	constructorExample(int x){
		System.out.println("parameterized constuctor called");
		num = x;
	}
	public static void main(String [] args) {
		System.out.println("Enter value: ");
		Scanner scr = new Scanner(System.in);
		int temp = scr.nextInt();
		
		constructorExample object = new constructorExample();
		System.out.println("number is : "+ object.num);
		constructorExample object2 = new constructorExample(temp);
		System.out.println("number is : "+ object2.num);
		scr.close();
	}
}
