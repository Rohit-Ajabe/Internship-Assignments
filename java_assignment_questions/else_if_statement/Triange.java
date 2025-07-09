// 8.Check if a triangle is equilateral, isosceles, or scalene
public class Triangle {
    public static void main(String[] args) {
        int side1 = 5, side2 = 5, side3 = 8;

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
