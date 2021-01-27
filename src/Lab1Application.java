public class Lab1Application {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(10, 20);
		DateManipulator dm = new DateManipulator();
		int area = r.calculateArea();
		int perimeter = r.calculatePerimeter();
		boolean leapYear = dm.isLeapYear(2100);
		System.out.println(area);
		System.out.println(perimeter);
		System.out.println(DistanceCalculator.calculateDistance(1, 2, 3, 4));
		System.out.println(BasicMath.add(1, 2));
		System.out.println(BasicMath.subtract(3, 4));
		System.out.println(BasicMath.multiply(5, 6));
		System.out.println(BasicMath.divide(7, 8));
		System.out.println(leapYear);
	}
}