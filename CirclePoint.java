import java.util.Scanner;

public class CirclePoint {
	public static double points;
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input a point (x y)");
		double x1 = 0;
		double y1 = 0;
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		points = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
		if (points <= 10) {
			System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle.");
		}
		else System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle.");
	}
}
