package circle_entity;

public class Point {
	private double x;
	private double y;
	private Point() {
		this.x=0;
		this.y=0;
	}
	public Point(double a,double b) {
		this();
		this.setCoordinate1(a);
		this.setCoordinate2(b);
	}
	public boolean setCoordinate1(double a) {
		if(a>=0 || a<=0) {
			this.x = a;
			return true;
		}
		return false;
	}
	public boolean setCoordinate2(double b) {
		if(b>=0 || b<=0) {
			this.y = b;
			return true;
		}
		return false;
	}
	public double getCoordinate1() {
		return this.x;
	}
	public double getCoordinate2() {
		return this.y;
	}
	public static double distance(Point a,Point b) {
		return Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y)*(b.y - a.y));
	}
}