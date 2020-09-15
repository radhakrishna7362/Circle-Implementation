package circle_collectors;

import java.util.*;
import circle_entity.*;

public class CircleCollection {
	private static Scanner  sc = new Scanner(System.in);
    static ArrayList<Circle> al = new ArrayList<Circle>();
    int count;
	public static void main(String[] args) {
		boolean repeat = true;
		while(repeat) {
				switch(mainMenu()) {
					case 1: insertCircle();
							break;
					case 2: displayCircleDetails();
							break;
					case 3: sortCircles();
							break;
					default: repeat = false;
				}
		}
	}
	private static void insertCircle() {
		System.out.println("Enter centre of circle:");
		System.out.println("Enter x-coordinate: ");
		double x = sc.nextDouble();
		System.out.println("Enter y-coordinate: ");
		double y = sc.nextDouble();
		Point p = new Point(x,y);
		System.out.println("Enter radius of circle: ");
		double r = sc.nextDouble();
		System.out.println("Enter color of circle: ");
		String color = sc.next();
		Circle c = new Circle(p,r,color);
		al.add(c);
		
	}
   private static int mainMenu() {
		System.out.println("1.Create Circle");
		System.out.println("2.Display circles");
		System.out.println("3.Sort Circles");
		System.out.println("Enter any other number to exit");
		return sc.nextInt();
	}
   private static void sortCircles() {
	   	Collections.sort(al);
		System.out.println(al);
	}
	private static void displayCircleDetails() {
		System.out.println(al);
	}
   public String toString() {
	   String out="";
	   for(int i=0;i<count;i++)
		   out+=this.al.get(i).toString();
	   return out;
   }
}