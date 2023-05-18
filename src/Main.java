public class Main {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();

        Circle circle = new Circle();
        shapePrinter.printShapeName(circle);

        Quad quad = new Quad();
        shapePrinter.printShapeName(quad);

        Rectangle rectangle = new Rectangle();
        shapePrinter.printShapeName(rectangle);

        Triangle triangle = new Triangle();
        shapePrinter.printShapeName(triangle);
    }
}