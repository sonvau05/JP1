package Entity;

public class Triangle extends Point {
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    // Check if the points form a valid triangle
    public boolean isTriangle() {
        double a = A.distance(B);
        double b = B.distance(C);
        double c = C.distance(A);
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Calculate the area using Heron's formula
    public double Area() {
        double a = A.distance(B);
        double b = B.distance(C);
        double c = C.distance(A);
        double s = (a + b + c) / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Check if a point p lies inside the triangle
    public boolean checkPointsTriangle(Point p) {
        // Calculate the area of the original triangle
        double areaABC = Area();

        // Create three smaller triangles with the point p
        Triangle ABP = new Triangle(A, B, p);
        Triangle ACP = new Triangle(A, C, p);
        Triangle BCP = new Triangle(B, C, p);

        // Calculate the sum of the areas of the three smaller triangles
        double sumAreas = ABP.Area() + ACP.Area() + BCP.Area();

        // Check if the sum of the areas equals the area of the original triangle
        return Math.abs(sumAreas - areaABC) < 1e-6; // tolerance to handle floating-point precision
    }

    // Calculate the perimeter of the triangle
    public double Perimeter() {
        double a = A.distance(B);
        double b = B.distance(C);
        double c = C.distance(A);
        return a + b + c;
    }
}
