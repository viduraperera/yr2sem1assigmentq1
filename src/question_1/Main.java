package question_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		do {
			Area a = new Area();
			
			System.out.println( "Geometry Calculator");
			System.out.println("1. Calculate the Area of a Circle");
			System.out.println("2. Calculate the Area of a Rectangle");
			System.out.println("3. Calculate the Area of a Triangle");
			System.out.println("4. exit");
			System.out.println( "enter the choice (1-4)");
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
			
			if(number == 1) {
				float radius;
				
				System.out.println("enter the radius");
				radius = input.nextFloat();
				
				a.GetAreaOfCircle(radius);
			}
			else if(number == 2) {
				float length, width;
				
				System.out.println("enter the length");
				length = input.nextFloat();
				
				System.out.println("enter the width");
				width = input.nextFloat();
				
				a.GetAreaOfRectangle(length, width);
			}
			else if(number == 3) {
				float base, height;
				System.out.println("enter the base");
				base = input.nextFloat();
				
				System.out.println("enter the height");
				height = input.nextFloat();
				
				a.GetAreaOfTriangle(base, height);
			}
			else if(number <= 0 || number >= 5) {
				System.out.println("invalid number");
			}
		} while (number != 4);
		System.out.println("exit");

	}

}
