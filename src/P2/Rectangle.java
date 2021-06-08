package P2;

import java.util.Scanner;
import P1.Shape;

public class Rectangle extends Shape {
    Scanner sc = new Scanner(System.in);

    double length;
    double width;

    @Override
    public void input() {
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
    }

    @Override
    public double area(){
        return length*width;
    }
}
