package educative.basics;

public class RectangleInheritance {

    private int length;
    private int width;

    public RectangleInheritance() {
    }

    public RectangleInheritance(int length, int width) {

        this.length = length;
        this.width = width;

    }

    public int getArea() {

        return this.length * this.width;
    }

    public static void main(String[] args) {

        RectangleInheritance rectangle = new RectangleInheritance(3,5);
        System.out.println(rectangle.getArea());

    }
}
