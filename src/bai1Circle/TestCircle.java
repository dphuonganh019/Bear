package bai1Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Bán kính của Circle1 là: " + circle1.getRadius());
        System.out.println("Diện tích của Circle1 là: " + circle1.getArea());
        System.out.println("Màu sắc của Circle1 là: " + circle1.getColor());

        Circle circle2 = new Circle(5.5,"blue");
        System.out.println("Bán kính của Circle2 là: " + circle2.getRadius());
        System.out.println("Diện tích của Circle2 là: " + circle2.getArea());
        System.out.println("Màu sắc của Circle2 là: " + circle2.getColor());
    }
}
