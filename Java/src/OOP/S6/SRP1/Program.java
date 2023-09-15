package OOP.S6.SRP1;

public class Program {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,2), 5);
        System.out.println(square.getArea());
        square.draw();
        SquareV2 squareV2 = new SquareV2(new Point(1,2), 5);
        System.out.println(squareV2.getArea());
        SquareDrawer squareDrawer = new SquareDrawer(squareV2, 3);
        squareDrawer.draw();



    }
}
