package P3;

import java.util.Scanner;
import P1.Shape;

public class Circle extends Shape {
    Scanner sc = new Scanner(System.in);

    double radius;

    @Override
    public void input() {
        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
    }

    @Override
    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
}
