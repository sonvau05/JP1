import Entity.Point;
import Entity.Triangle;

public class Main {
    public static void main(String[] args) {
        // Create points of the triangle
        Point A = new Point(0, 0);  // Point A at coordinates (0, 0)
        Point B = new Point(4, 0);  // Point B at coordinates (4, 0)
        Point C = new Point(0, 3);  // Point C at coordinates (0, 3)

        // Create a triangle using points A, B, C
        Triangle triangle = new Triangle(A, B, C);

        // Check if the three points form a valid triangle
        if (triangle.isTriangle()) {
            System.out.println("The three points form a triangle.");
            System.out.println("Perimeter of the triangle: " + triangle.Perimeter());
            System.out.println("Area of the triangle: " + triangle.Area());

            // Check if a point lies inside the triangle
            Point P = new Point(1, 1); // Point P at coordinates (1, 1)
            if (triangle.checkPointsTriangle(P)) {
                System.out.println("Point P lies inside the triangle.");
            } else {
                System.out.println("Point P does not lie inside the triangle.");
            }
        } else {
            System.out.println("The three points do not form a triangle.");
        }
    }
}
