package S12.OCP;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add((new RightTriangle(3,2)));
        shapes.add((new Circle(4)));
        shapes.add((new Square(5)));

        double sumArea = 0;

        for (Shape shape: shapes){
            sumArea += shape.getArea();
        }

        System.out.printf("Площадь фигур: %.2f", sumArea);
    }


}
