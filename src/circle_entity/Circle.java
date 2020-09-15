package circle_entity;

import java.util.Date;

public class Circle implements Comparable<Circle> {
	private double r;
	private String color;
	private Date dateCreated;
	private Point p;
	private Circle() {
		this.r = 0;
		this.color = "Red";
		this.dateCreated = new Date();
		this.p = new Point(0,0);
	}
	public Circle(Point p,double r,String c) {
		this();
		this.setCentre(p);
		this.setRadius(r);
		this.setColor(c);
	}
	public boolean setCentre(Point p) {
		if(p != null) {
			this.p = p;
			return true;
		}
		return false;
	}
	public boolean setRadius(double r) {
		if(r>=0) {
			this.r = r;
			return true;
		}
		return false;
	}
	public void setColor(String c) {
			this.color = c;
		}
	public double getRadius() {
		return this.r;
	}
	public String getColor() {
		return this.color;
	}
	public Point getCentre() {
		return this.p;
	}
	public Date getDate() {
		return this.dateCreated;
	}
	public double calcArea() {
		return Math.PI * this.r*this.r;
	}
	public double calcPerimeter() {
		return 2*Math.PI*this.r;
	}
	public int compareTwoCircles(Circle c1,Circle c2) {
		double d = Point.distance(c1.getCentre(), c2.getCentre());
		if(Math.abs(c1.getRadius() - c2.getRadius()) < d && d < c1.getRadius() + c2.getRadius())
			return 0;
		else if(d == c1.getRadius() + c2.getRadius())
			return 1;
		else if(d > c1.getRadius() + c2.getRadius())
			return 2;
		else if(d == Math.abs(c1.getRadius() - c2.getRadius()))
			return -1;
		else if(d < Math.abs(c1.getRadius() - c2.getRadius()))
			return -2;
		else
			return -3;
	}
	public int compareTo(Circle c) {
		if(this.calcArea() == c.calcArea())
			return 0;
		else if(this.calcArea() > c.calcArea())
			return 1;
		else
			return -1;
	}
	public String toString() {
		String out ="";
		out+=String.format("Centre of circle = (%f , %f) %n",this.getCentre().getCoordinate1(),this.getCentre().getCoordinate2());
		out+=String.format("Perimeter = %f %n", this.calcPerimeter());
		out+=String.format("Area = %f %n", this.calcArea());
		out+=String.format("Color: %s %n", this.getColor());
		out+=String.format("Date Created: %s %n", this.getDate());
		return out;
	}
}